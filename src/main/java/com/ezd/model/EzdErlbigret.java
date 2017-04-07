package com.ezd.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/6.
 * 大招会报名表
 */
public class EzdErlbigret {
    private int erlbigretId;
    private EzdBigret erlbigretMes;//references ezd_bigret(bigret_id), --  报名了那个大招会
    private EzdUmg erlbigretUser;//references ezd_umg(umg_id), --   谁报名了大招会
    private EzdRestatus erlbigretStatus;//references ezd_restatus(restatus_id), --  报名状态 (已报名 审核 录用 拒绝)
    private Date erlbigretTime;//报名时间

    public int getErlbigretId() {
        return erlbigretId;
    }

    public void setErlbigretId(int erlbigretId) {
        this.erlbigretId = erlbigretId;
    }

    @Override
    public String toString() {
        return "EzdErlbigret{" +
                "erlbigretId=" + erlbigretId +
                ", erlbigretMes=" + erlbigretMes +
                ", erlbigretUser=" + erlbigretUser +
                ", erlbigretStatus=" + erlbigretStatus +
                ", erlbigretTime=" + erlbigretTime +
                '}';
    }

    public EzdUmg getErlbigretUser() {
        return erlbigretUser;
    }

    public void setErlbigretUser(EzdUmg erlbigretUser) {
        this.erlbigretUser = erlbigretUser;
    }

    public EzdRestatus getErlbigretStatus() {
        return erlbigretStatus;
    }

    public void setErlbigretStatus(EzdRestatus erlbigretStatus) {
        this.erlbigretStatus = erlbigretStatus;
    }

    public EzdBigret getErlbigretMes() {

        return erlbigretMes;
    }

    public void setErlbigretMes(EzdBigret erlbigretMes) {
        this.erlbigretMes = erlbigretMes;
    }

    public Date getErlbigretTime() {
        return erlbigretTime;
    }

    public void setErlbigretTime(Date erlbigretTime) {
        this.erlbigretTime = erlbigretTime;
    }

    public EzdErlbigret() {

    }
}
