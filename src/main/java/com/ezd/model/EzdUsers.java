package com.ezd.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/6.
 */
//用户表
public class EzdUsers {

    private int userId; //用户编号
    private String userPhone; //电话
    private String userPwd; //密码
    private Date userUptime; //创建时间

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Date getUserUptime() {
        return userUptime;
    }

    public void setUserUptime(Date userUptime) {
        this.userUptime = userUptime;
    }

    @Override
    public String toString() {
        return "EzdUsers{" +
                "userId=" + userId +
                ", userPhone='" + userPhone + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userUptime=" + userUptime +
                '}';
    }
}
