package com.ezd.service;

import com.ezd.dao.*;
import com.ezd.model.EzdRole;
import com.ezd.model.EzdUmg;
import com.ezd.model.EzdUsers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class EzdUserService {
    @Resource
    private EzdUsersDao ezdUsersDao;
    @Resource
    private EzdRoleDao ezdRoleDao;
    @Resource
    private EzdUmgDao ezdUmgDao;
    @Resource
    private EzdPermissionDao ezdPermissionDao;
    //登录
    public EzdUsers login(EzdUsers ezdUsers) {
        return  ezdUsersDao.login(ezdUsers);
    }
    //注册用户
    public int addUser(EzdUsers ezdUsers,String name){
        int i =0;
        try {
           ezdUsersDao.addUser(ezdUsers);
           EzdUmg ezdUmg = new EzdUmg();
           ezdUmg.setUmgUser(ezdUsers);
           ezdUmg.setUmgName(name);
           ezdUmg.setUmgPhoto("/img/userDefault.png");
            i = ezdUmgDao.insetAll(ezdUmg);
       }catch(Exception e){
           e.printStackTrace();
       }
       return i;
    }
    //检查用户是否存在
    public int checkUser(String userPhone){
        return ezdUsersDao.checkUser(userPhone);
    }

    //根据umgId获取user的信息
    public EzdUsers getUsers(int id){
       return ezdUsersDao.getEzdUsersAll(id);
    }


    //根据号码 获取 usrs
    public EzdUsers getByPhone(String phone){
         EzdUsers ezdUsers = new EzdUsers();

        try{
            ezdUsers = ezdUsersDao.getByPhone(phone);
            List<EzdRole> ezdRoles = ezdRoleDao.getRoleByUserId(ezdUsers.getUserId());
            if(ezdRoles.size() != 0){
                for(EzdRole role:ezdRoles){
                    role.setEzdPermissions(ezdPermissionDao.getPerByRoleId(role.getRoleId()));
                }
                ezdUsers.setEzdRoles(ezdRoles);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return ezdUsers;
    }
}
