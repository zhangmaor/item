package com.ezd.controller.background;

import com.ezd.dao.EzdUsersDao;
import com.ezd.model.EzdUsers;
import com.ezd.utils.MD5Utils;
import com.ezd.validators.RigisterValiddator;
import org.springframework.stereotype.Controller;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

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

}
