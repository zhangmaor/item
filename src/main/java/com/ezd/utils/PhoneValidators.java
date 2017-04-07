package com.ezd.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/4/7.
 * 对手机号码的验证
 * 如果输入的是一个11位的手机号的话就返回true
 * 否则的话就返回false
 */
public class PhoneValidators {
    public static boolean isMobileNO(String mobiles){

        Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");

        Matcher m = p.matcher(mobiles);

        //System.out.println(m.matches()+"---");

        return m.matches();

    }
}
