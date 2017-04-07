package com.ezd.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/6.
 */
public class EzdSchret {
    private int schretId;
    private int schretSchmg;//references ezd_schmg(schmg_id),--   那所学校开校招会
    private int schretEnmg;//references ezd_enmg(enmg_id),--  那家公司在招聘
    private int schretStatus;//references ezd_newsStatus(newsStatus_id),--  校招聘状态 （未开始 已结束 进行中)
    private String schretDetail;//校招会详情
    private Date schretTime;//校招会始时间
    private Date schretCretime;//校招会发布时间
    private String bigretPost;//招聘职位

    @Override
    public String toString() {
        return "EzdSchret{" +
                "schretId=" + schretId +
                ", schretSchmg=" + schretSchmg +
                ", schretEnmg=" + schretEnmg +
                ", schretStatus=" + schretStatus +
                ", schretDetail='" + schretDetail + '\'' +
                ", schretTime=" + schretTime +
                ", schretCretime=" + schretCretime +
                ", bigretPost='" + bigretPost + '\'' +
                '}';
    }

    public EzdSchret() {
    }

    public int getSchretId() {

        return schretId;
    }

    public void setSchretId(int schretId) {
        this.schretId = schretId;
    }

    public int getSchretSchmg() {
        return schretSchmg;
    }

    public void setSchretSchmg(int schretSchmg) {
        this.schretSchmg = schretSchmg;
    }

    public int getSchretEnmg() {
        return schretEnmg;
    }

    public void setSchretEnmg(int schretEnmg) {
        this.schretEnmg = schretEnmg;
    }

    public int getSchretStatus() {
        return schretStatus;
    }

    public void setSchretStatus(int schretStatus) {
        this.schretStatus = schretStatus;
    }

    public String getSchretDetail() {
        return schretDetail;
    }

    public void setSchretDetail(String schretDetail) {
        this.schretDetail = schretDetail;
    }

    public Date getSchretTime() {
        return schretTime;
    }

    public void setSchretTime(Date schretTime) {
        this.schretTime = schretTime;
    }

    public Date getSchretCretime() {
        return schretCretime;
    }

    public void setSchretCretime(Date schretCretime) {
        this.schretCretime = schretCretime;
    }

    public String getBigretPost() {
        return bigretPost;
    }

    public void setBigretPost(String bigretPost) {
        this.bigretPost = bigretPost;
    }
}
