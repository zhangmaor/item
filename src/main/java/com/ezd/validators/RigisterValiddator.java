package com.ezd.validators;

import com.ezd.model.EzdUsers;
import com.ezd.utils.PhoneValidators;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by Administrator on 2017/4/6.
 * 注册时的验证
 * 登陆的时候好像也可以这样使用哦？
 *
 */
public class RigisterValiddator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
       return  clazz.equals(EzdUsers.class);

    }

    @Override
    public void validate(Object target, Errors errors) {
        EzdUsers ezdUsers = (EzdUsers) target;
        System.out.println("是否经过此次验证！！！");
        //注册的时候判断手机号是否符合要求
        if(!PhoneValidators.isMobileNO(ezdUsers.getUserPhone())){
            errors.rejectValue("userPhone", null, "手机号码错误");
        }
        //密码不能为空
        if (ezdUsers.getUserPwd().isEmpty() ||ezdUsers.getUserPwd().length()<=4 ) {
            System.out.println("密码错误++++++++++++++++++++++++++");
            errors.rejectValue("userPwd", null, "密码不能为空");
        }
        }
}

