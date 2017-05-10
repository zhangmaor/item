package com.ezd.utils;

import com.ezd.model.EzdPermission;
import com.ezd.model.EzdRole;
import com.ezd.model.EzdUsers;
import com.ezd.service.EzdUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class Myshiro extends AuthorizingRealm {

    @Resource
    private EzdUserService ezdUserService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取登录时输入的用户名
        String userName=(String) principalCollection.fromRealm(getName()).iterator().next();

        //到数据库查是否有此对象
        EzdUsers user= ezdUserService.getByPhone(userName);
        System.out.println("this is AuthorizationInfo"+user);

        if(user!=null){
            //权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
            SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
            //用户的角色集合
            Set<String> roles = new HashSet<String>();
            for(EzdRole s : user.getEzdRoles()){
                roles.add(s.getRoleName());
            }
            info.setRoles(roles);

            //用户的角色对应的所有权限，如果只使用角色定义访问权限，下面的四行可以不要
            List<EzdRole> roleList= user.getEzdRoles();
            for (EzdRole role : roleList) {
                for(EzdPermission per : role.getEzdPermissions()){
                    System.out.println("permission name ="+per.getPerName());
                    info.addStringPermission(per.getPerName());
                }
            }

            System.out.println("info permissionNames ="+info.getStringPermissions());

            return info;
        }
        return null;
    }

    /**
     * 登录论证
     **/



    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authenticationToken) throws AuthenticationException {
        //UsernamePasswordToken对象用来存放提交的登录信息
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        //查出是否有此用户
        System.out.println("this is AuthenticationInfo"+token.getUsername());
        System.out.println("this name is "+token.getUsername());
        EzdUsers user= ezdUserService.getByPhone(token.getUsername());

        if(user!=null){
            //若存在，将此用户存放到登录认证info中
            return new SimpleAuthenticationInfo(user.getUserPhone(), user.getUserPwd(), getName());
        }
        return null;
    }

}

