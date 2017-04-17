package com.ezd.utils;

/**
 * Created by Administrator on 2017/4/13.
 * 这个是生成随机数名字的
 * 用来在上传图片的时候进行给图片命名！
 */
public class RandomName {
    public String getRandom() {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String name;
        long random = Math.round(Math.random() * 1000000000);
        char a = chars.charAt((int) (Math.random() * 26));
        char b = chars.charAt((int) (Math.random() * 26));
        name = "" + a + b + random;
        return name;


    }
}
