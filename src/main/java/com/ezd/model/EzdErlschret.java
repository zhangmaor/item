package com.ezd.model;

import java.util.Date;

/**
 * 校招会报名表
 * Created by Administrator on 2017/4/6.
 */
public class EzdErlschret {

    private int erlschretId ;
    private EzdUmg   erlschretUser ;// references ezd_umg(umg_id),--   谁报名了
    private EzdSchret  erlschretSchret ;// references ezd_schret(schret_id),--   报名了那个校招会\

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

    private EzdRestatus  erlschretStatus ;//references ezd_restatus(restatus_id), --  包名状态 (已报名 审核 录用 拒绝)
    private Date erlschretTime ;//

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
