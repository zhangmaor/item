package com.ezd.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/6.
 */
public class EzdErlbigret {
    private int erlbigretId;
    private int erlbigretMes;//references ezd_bigret(bigret_id), --  报名了那个大招会
    private int erlbigretUser;//references ezd_umg(umg_id), --   谁报名了大招会
    private int erlbigretStatus;//references ezd_restatus(restatus_id), --  报名状态 (已报名 审核 录用 拒绝)
    private Date erlbigretTime;//报名时间

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

    public int getErlbigretId() {
        return erlbigretId;
    }

    public void setErlbigretId(int erlbigretId) {
        this.erlbigretId = erlbigretId;
    }

    public int getErlbigretMes() {
        return erlbigretMes;
    }

    public void setErlbigretMes(int erlbigretMes) {
        this.erlbigretMes = erlbigretMes;
    }

    public int getErlbigretUser() {
        return erlbigretUser;
    }

    public void setErlbigretUser(int erlbigretUser) {
        this.erlbigretUser = erlbigretUser;
    }

    public int getErlbigretStatus() {
        return erlbigretStatus;
    }

    public void setErlbigretStatus(int erlbigretStatus) {
        this.erlbigretStatus = erlbigretStatus;
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
