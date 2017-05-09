package com.ezd.controller.background;

import com.ezd.dao.EzdUsersDao;
import com.ezd.model.EzdUsers;
import com.ezd.utils.MD5Utils;
import com.ezd.validators.RigisterValiddator;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * Created by Administrator on 2017/5/9.
 */


@Controller
@RequestMapping("/login")
public class BgLogin {

    @Resource
    private EzdUsersDao ezdUsersDao;

    @RequestMapping
    public String index(){
        return "login";
    }

    @RequestMapping(value = "/commit",method = RequestMethod.POST)
    public String commit(EzdUsers ezdUsers, HttpSession session){
        System.out.println(ezdUsers.getUserPwd());

        System.out.println("md5+++"+ MD5Utils.encode2hex(ezdUsers.getUserPwd()));
        ezdUsers.setUserPwd(MD5Utils.encode2hex(ezdUsers.getUserPwd()));
        int num = ezdUsersDao.getCount(ezdUsers);

        if(num>0){
            session.setAttribute("user",ezdUsers.getUserPhone());
            return "redirect:/bg/index";
        }
        return "login";
    }
    @PostMapping()
    public String login(@Valid EzdUsers user, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        try {
            if(bindingResult.hasErrors()){
                System.out.println(" hasError");
                return "/login";
            }
            System.out.println(user.getUserPhone()+"sssss"+user.getUserPwd());
            //使用权限工具进行用户登录，登录成功后跳到shiro配置的successUrl中，与下面的return没什么关系！
            UsernamePasswordToken upt = new UsernamePasswordToken(user.getUserPhone(), user.getUserPwd());

            System.out.println("======= "+upt.getUsername()+"test =======");
            SecurityUtils.getSubject().login(upt);
            return "redirect:/bg";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("message","用户名或密码错误");
            return "redirect:/login";
        }
    }

}
