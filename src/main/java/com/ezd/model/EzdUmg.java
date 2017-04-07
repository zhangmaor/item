package com.ezd.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/6.
 */
//用户信息表
public class EzdUmg {

    private int umgId;
    private int umgUser; //references ezd_users(user_id),-- 引用用户的主键
    private String umgPhoto ;//头像
    private String umgName  ;//姓名
    private String umgSex ; //性别
    private Date umg_birthday ; //生日
    private String umgEmail ;//邮箱
    private String umgSchool ;//学校
    private String  umgMajor ;//专业
    private String umgDegree ;//学历
    private String umgSayMf ;//自我评价
    private String umgEducation ;//教育经历
    private Date umgUptime ; //修改时间

    public int getUmgId() {
        return umgId;
    }

    public void setUmgId(int umgId) {
        this.umgId = umgId;
    }

    public String getUmgPhoto() {
        return umgPhoto;
    }

    public void setUmgPhoto(String umgPhoto) {
        this.umgPhoto = umgPhoto;
    }

    public String getUmgName() {
        return umgName;
    }

    public void setUmgName(String umgName) {
        this.umgName = umgName;
    }

    public String getUmgSex() {
        return umgSex;
    }

    public void setUmgSex(String umgSex) {
        this.umgSex = umgSex;
    }

    public Date getUmg_birthday() {
        return umg_birthday;
    }

    public void setUmg_birthday(Date umg_birthday) {
        this.umg_birthday = umg_birthday;
    }

    public String getUmgEmail() {
        return umgEmail;
    }

    public void setUmgEmail(String umgEmail) {
        this.umgEmail = umgEmail;
    }

    public String getUmgSchool() {
        return umgSchool;
    }

    public void setUmgSchool(String umgSchool) {
        this.umgSchool = umgSchool;
    }

    public String getUmgMajor() {
        return umgMajor;
    }

    public void setUmgMajor(String umgMajor) {
        this.umgMajor = umgMajor;
    }

    public String getUmgDegree() {
        return umgDegree;
    }

    public void setUmgDegree(String umgDegree) {
        this.umgDegree = umgDegree;
    }

    public String getUmgSayMf() {
        return umgSayMf;
    }

    public void setUmgSayMf(String umgSayMf) {
        this.umgSayMf = umgSayMf;
    }

    public String getUmgEducation() {
        return umgEducation;
    }

    public void setUmgEducation(String umgEducation) {
        this.umgEducation = umgEducation;
    }

    public Date getUmgUptime() {
        return umgUptime;
    }

    public void setUmgUptime(Date umgUptime) {
        this.umgUptime = umgUptime;
    }

    public int getUmgUser() {
        return umgUser;
    }

    public void setUmgUser(int umgUser) {
        this.umgUser = umgUser;
    }

    @Override
    public String toString() {
        return "EzdUmg{" +
                "umgId=" + umgId +
                ", umgUser=" + umgUser +
                ", umgPhoto='" + umgPhoto + '\'' +
                ", umgName='" + umgName + '\'' +
                ", umgSex='" + umgSex + '\'' +
                ", umg_birthday=" + umg_birthday +
                ", umgEmail='" + umgEmail + '\'' +
                ", umgSchool='" + umgSchool + '\'' +
                ", umgMajor='" + umgMajor + '\'' +
                ", umgDegree='" + umgDegree + '\'' +
                ", umgSayMf='" + umgSayMf + '\'' +
                ", umgEducation='" + umgEducation + '\'' +
                ", umgUptime=" + umgUptime +
                '}';
    }
}
