package com.ezd.model;

import java.util.Date;

/**
 * 校招会报名表
 * Created by Administrator on 2017/4/6.
 */
public class EzdErlschret {

    private int erlschretId ;
    private int schmgId; // INT ,--   那所学校开校招会
    private int enmgId ; // INT ,--  那家公司在招聘
    private int statusId; //  INT,--  校招聘状态 （未开始 已结束 进行中)
    private EzdUmg   erlschretUser ;// references ezd_umg(umg_id),--   谁报名了
    private EzdSchret  erlschretSchret ;// references ezd_schret(schret_id),--   报名了那个校招会\
    private EzdRestatus  erlschretStatus ;//references ezd_restatus(restatus_id), --  包名状态 (已报名 审核 录用 拒绝)
    private Date erlschretTime ;//报名时间

    public int getSchmgId() {
        return schmgId;
    }

    public void setSchmgId(int schmgId) {
        this.schmgId = schmgId;
    }

    public int getEnmgId() {
        return enmgId;
    }

    public void setEnmgId(int enmgId) {
        this.enmgId = enmgId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public EzdUmg getErlschretUser() {
        return erlschretUser;
    }

    public EzdSchret getErlschretSchret() {
        return erlschretSchret;
    }

    public EzdRestatus getErlschretStatus() {
        return erlschretStatus;
    }

    @Override
    public String toString() {
        return "EzdErlschret{" +
                "erlschretId=" + erlschretId +
                ", erlschretUser=" + erlschretUser +
                ", erlschretSchret=" + erlschretSchret +
                ", erlschretStatus=" + erlschretStatus +
                ", erlschretTime=" + erlschretTime +
                '}';
    }

    public void setErlschretUser(EzdUmg erlschretUser) {
        this.erlschretUser = erlschretUser;
    }

    public void setErlschretSchret(EzdSchret erlschretSchret) {
        this.erlschretSchret = erlschretSchret;
    }

    public void setErlschretStatus(EzdRestatus erlschretStatus) {
        this.erlschretStatus = erlschretStatus;
    }


    public int getErlschretId() {
        return erlschretId;
    }

    public void setErlschretId(int erlschretId) {
        this.erlschretId = erlschretId;
    }


    public Date getErlschretTime() {
        return erlschretTime;
    }

    public void setErlschretTime(Date erlschretTime) {
        this.erlschretTime = erlschretTime;
    }
}
