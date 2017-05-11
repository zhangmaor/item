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
import org.springframework.web.bind.annotation.*;
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

    @GetMapping
    public String index(){
        return "login";
    }

    /*@RequestMapping(value = "/commit",method = RequestMethod.POST)
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
    }*/


    @RequestMapping("/403")
    public String notPermission(HttpSession session){
        session.setAttribute("notPsermissio","no");
        System.out.println("=============403===============");
        return "redirect:/enret/403";
    }

    @PostMapping
    public String login(@Valid EzdUsers user, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        user.setUserPwd(MD5Utils.encode2hex(user.getUserPwd()));

        try {
            if(bindingResult.hasErrors()){

                return "/login";
            }

            //使用权限工具进行用户登录，登录成功后跳到shiro配置的successUrl中，与下面的return没什么关系！
            UsernamePasswordToken upt = new UsernamePasswordToken(user.getUserPhone(), user.getUserPwd());


            SecurityUtils.getSubject().login(upt);
            return "redirect:/bg";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("message","用户名或密码错误");
            return "redirect:/login";
        }
    }

    @RequestMapping(value="/logout",method=RequestMethod.GET)
    public String logout(RedirectAttributes redirectAttributes ){
        //使用权限管理工具进行用户的退出，跳出登录，给出提示信息
        SecurityUtils.getSubject().logout();
        redirectAttributes.addFlashAttribute("message", "您已安全退出");
        return "redirect:/login";
    }


}
