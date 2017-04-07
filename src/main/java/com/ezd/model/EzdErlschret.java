package com.ezd.model;

import java.util.Date;

/**
 * 校招会报名表
 * Created by Administrator on 2017/4/6.
 */
public class EzdErlschret {

    private int erlschretId ;
    private int   erlschretUser ;// references ezd_umg(umg_id),--   谁报名了
    private int  erlschretSchret ;// references ezd_schret(schret_id),--   报名了那个校招会\
    private int  erlschretStatus ;//references ezd_restatus(restatus_id), --  包名状态 (已报名 审核 录用 拒绝)
    private Date erlschretTime ;//

    public int getErlschretId() {
        return erlschretId;
    }

    public void setErlschretId(int erlschretId) {
        this.erlschretId = erlschretId;
    }

    public int getErlschretUser() {
        return erlschretUser;
    }

    public void setErlschretUser(int erlschretUser) {
        this.erlschretUser = erlschretUser;
    }

    public int getErlschretSchret() {
        return erlschretSchret;
    }

    public void setErlschretSchret(int erlschretSchret) {
        this.erlschretSchret = erlschretSchret;
    }

    public int getErlschretStatus() {
        return erlschretStatus;
    }

    public void setErlschretStatus(int erlschretStatus) {
        this.erlschretStatus = erlschretStatus;
    }

    public Date getErlschretTime() {
        return erlschretTime;
    }

    public void setErlschretTime(Date erlschretTime) {
        this.erlschretTime = erlschretTime;
    }
}
