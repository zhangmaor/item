package com.ezd.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/4/6.
 */
//用户信息表
public class EzdUmg {

    private int umgId;
    private EzdUsers umgUser; //references ezd_users(user_id),-- 引用用户的主键
    private String umgPhoto ;//头像
    private String umgName  ;//姓名
    private String umgSex ; //性别
    private Date umgBirthday ; //生日
    private String umgEmail ;//邮箱
    private String umgSchool ;//学校
    private String  umgMajor ;//专业
    private String umgDegree ;//学历
    private String umgSayMf ;//自我评价
    private String umgEducation ;//教育经历
    private Date umgUptime ; //修改时间
    private int userId; // 用户表的Id
    private List<EzdJobmg> ezdJobmgs; //用户兼职信息表
    private List<EzdEnmg> ezdEnmgs;//关注的公司
    private List<EzdUnews> ezdUnewss ;//收到的信息（消息
    private List<EzdErlenret> ezdErlenrets;//对应的报名信息表
    private List<EzdEnret> ezdEnrets;//本用户浏览的招聘信息
    private List<EzdErlbigret> ezdErlbigrets;//本用户报名了那个大招会
    private List<EzdErlschret> ezdErlschrets;//本用户报名了那个校招会
    private List<EzdReadarti> ezdReadartis;//本用户阅读了那些文章


    public List<EzdJobmg> getEzdJobmgs() {
        return ezdJobmgs;
    }

    public void setEzdJobmgs(List<EzdJobmg> ezdJobmgs) {
        this.ezdJobmgs = ezdJobmgs;
    }

    public int getUmgId() {
        return umgId;
    }

    public void setUmgId(int umgId) {
        this.umgId = umgId;
    }

    public EzdUsers getUmgUser() {
        return umgUser;
    }

    public void setUmgUser(EzdUsers umgUser) {
        this.umgUser = umgUser;
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

    public Date getUmgBirthday() {
        return umgBirthday;
    }

    public void setUmgBirthday(Date umgBirthday) {
        this.umgBirthday = umgBirthday;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<EzdEnmg> getEzdEnmgs() {
        return ezdEnmgs;
    }

    public void setEzdEnmgs(List<EzdEnmg> ezdEnmgs) {
        this.ezdEnmgs = ezdEnmgs;
    }

    public List<EzdUnews> getEzdUnewss() {
        return ezdUnewss;
    }

    public void setEzdUnewss(List<EzdUnews> ezdUnewss) {
        this.ezdUnewss = ezdUnewss;
    }

    public List<EzdErlenret> getEzdErlenrets() {
        return ezdErlenrets;
    }

    public void setEzdErlenrets(List<EzdErlenret> ezdErlenrets) {
        this.ezdErlenrets = ezdErlenrets;
    }

    public List<EzdEnret> getEzdEnrets() {
        return ezdEnrets;
    }

    public void setEzdEnrets(List<EzdEnret> ezdEnrets) {
        this.ezdEnrets = ezdEnrets;
    }

    public List<EzdErlbigret> getEzdErlbigrets() {
        return ezdErlbigrets;
    }

    public void setEzdErlbigrets(List<EzdErlbigret> ezdErlbigrets) {
        this.ezdErlbigrets = ezdErlbigrets;
    }

    public List<EzdErlschret> getEzdErlschrets() {
        return ezdErlschrets;
    }

    public void setEzdErlschrets(List<EzdErlschret> ezdErlschrets) {
        this.ezdErlschrets = ezdErlschrets;
    }

    public List<EzdReadarti> getEzdReadartis() {
        return ezdReadartis;
    }

    public void setEzdReadartis(List<EzdReadarti> ezdReadartis) {
        this.ezdReadartis = ezdReadartis;
    }

    @Override
    public String toString() {
        return "EzdUmg{" +
                "umgId=" + umgId +
                ", umgPhoto='" + umgPhoto + '\'' +
                ", umgName='" + umgName + '\'' +
                ", umgSex='" + umgSex + '\'' +
                ", umgBirthday=" + umgBirthday +
                ", umgEmail='" + umgEmail + '\'' +
                ", umgSchool='" + umgSchool + '\'' +
                ", umgMajor='" + umgMajor + '\'' +
                ", umgDegree='" + umgDegree + '\'' +
                ", umgSayMf='" + umgSayMf + '\'' +
                ", umgEducation='" + umgEducation + '\'' +
                ", umgUptime=" + umgUptime +
                ", userId=" + userId +
                '}';
    }
}
