package com.ezd.model;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/4/6.
 * 校招会
 */
public class EzdSchret {

    private int schretId;
    private int schmgId ; //  INT ,--   那所学校开校招会
    private int enmgId ; //INT ,--  那家公司在招聘
    private int statusId ; // INT,--  校招聘状态 （未开始 已结束 进行中)
    private EzdSchmg schretSchmg;//references ezd_schmg(schmg_id),--   那所学校开校招会
    private EzdEnmg schretEnmg;//references ezd_enmg(enmg_id),--  那家公司在招聘
    private EzdNewsStatus schretStatus;//references ezd_newsStatus(newsStatus_id),--  校招聘状态 （未开始 已结束 进行中)
    private String schretDetail;//校招会详情
    private Date schretTime;//校招会始时间
    private Date schretCretime;//校招会发布时间
    private String bigretPost;//招聘职位
    private List<EzdErlschret> ezdErlschrets;//报名本校招会的信息

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
                ", ezdErlschrets=" + ezdErlschrets +
                '}';
    }

    public List<EzdErlschret> getEzdErlschrets() {
        return ezdErlschrets;
    }

    public void setEzdErlschrets(List<EzdErlschret> ezdErlschrets) {
        this.ezdErlschrets = ezdErlschrets;
    }

    public EzdSchret() {
    }

    public int getSchretId() {

        return schretId;
    }

    public void setSchretId(int schretId) {
        this.schretId = schretId;
    }


    public EzdSchmg getSchretSchmg() {
        return schretSchmg;
    }

    public void setSchretSchmg(EzdSchmg schretSchmg) {
        this.schretSchmg = schretSchmg;
    }

    public EzdEnmg getSchretEnmg() {
        return schretEnmg;
    }

    public void setSchretEnmg(EzdEnmg schretEnmg) {
        this.schretEnmg = schretEnmg;
    }

    public EzdNewsStatus getSchretStatus() {
        return schretStatus;
    }

    public void setSchretStatus(EzdNewsStatus schretStatus) {
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
