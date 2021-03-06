package com.ezd.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/4/6.
 */
//用户表
public class EzdUsers {

    private int userId; //用户编号
    private String userPhone; //电话
    private String userPwd; //密码
    private Date userUptime; //创建时间
    private EzdUmg ezdUmg;
    private List<EzdRole> ezdRoles;


    public List<EzdRole> getEzdRoles() {
        return ezdRoles;
    }

    public void setEzdRoles(List<EzdRole> ezdRoles) {
        this.ezdRoles = ezdRoles;
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

    public EzdUmg getEzdUmg() {
        return ezdUmg;
    }

    public void setEzdUmg(EzdUmg ezdUmg) {
        this.ezdUmg = ezdUmg;
    }

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

}
