package com.ezd.controller.app;

import com.ezd.jackonInterface.LogUmg;
import com.ezd.model.EzdUmg;
import com.ezd.model.EzdUsers;
import com.ezd.service.EzdUserService;
import com.ezd.utils.Sendsms;
import com.ezd.validators.RigisterValiddator;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Created by Administrator on 2017/4/7.
 */
@Controller
@RequestMapping("/logandrigret")
public class RegisterAndLogin {

    @Resource
    private EzdUserService userService;

    private final String PHONE_CODE = "phone_code";

    @InitBinder
    protected void init(DataBinder binder) {
        binder.setValidator(new RigisterValiddator());
}
    /*/logandrigret/log?phone=15979791514&pwd=123456789
    * */
    @RequestMapping(value = "/log",method = RequestMethod.GET)
    public void log(@Validated EzdUsers ezdUsers,HttpServletResponse response) {
        EzdUsers users = userService.login(ezdUsers);
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixInAnnotations(EzdUmg.class, LogUmg.class);
        OutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mapper.writeValue(outputStream,users);
        } catch (IOException e) {
            e.printStackTrace();
        }
       // return users;
    }

    @RequestMapping("/reg")
    public String reg() {
        return "regist";
    }

    /**
     * 登录
     *
     * @param user
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(EzdUsers user, Model model) throws Exception {
        EzdUsers use = userService.login(user);
        if (use != null) {
            model.addAttribute("users",user);
            return "welcom";
        }
        return "error";
    }

    /**
     * 注册用户
     * @param users
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping("/regist")
    public String addUser(HttpServletRequest request, @ModelAttribute("users") @Validated EzdUsers users, Errors errors, String codes,String name) throws Exception {
        int user = 0;
        if (errors.hasErrors()) {
            return "regist";
        }
        HttpSession session = request.getSession();
        int code = (int) session.getAttribute("userCode");
        String phone = (String) session.getAttribute("userPhone");
        int ss = Integer.parseInt(codes);
        if (phone.equals(users.getUserPhone()) && code == ss) {
            users.setUserUptime(new Date());
            user = userService.addUser(users,name);
 
            if (user > 0) {
                return "login";

            }
        }
        return "error";
    }

    /**
     * Ajax提交号码，进行短信发送
     *
     * @param phone
     * @param request
     * @return
     */
    @RequestMapping(value = "/sendSms")
    @ResponseBody
    public int sendSMS(@RequestParam("phone") String phone, HttpServletRequest request) {
        //检查手机号是否注册
        if (userService.checkUser(phone) > 0) {
            return 1;
        }
        Sendsms sendsms = new Sendsms();
        int code = sendsms.getnote(phone);
        HttpSession session = request.getSession();
        session.setAttribute("userPhone", phone);
        session.setAttribute("userCode", code);
        session.setAttribute("userUptime", new Date().getTime());
        return code;
    }
}
