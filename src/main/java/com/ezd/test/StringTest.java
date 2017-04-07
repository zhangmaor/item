package com.ezd.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/4/7.
 * 对字符串的测试
 */
public class StringTest {
    public static void main(String[] args) {
        System.out.println(StringTest.isMobileNO("1362046343"));
    }
    public static boolean isMobileNO(String mobiles){

    Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");

    Matcher m = p.matcher(mobiles);

    System.out.println(m.matches()+"---");

    return m.matches();

    }
}
