package com.ezd.model;

/**
 * Created by Administrator on 2017-04-06.
 */
//用户兼职信息表
public class EzdJobmg {
    private int jobmgId;
    private int jobmgUser;  //refereces ezd_umg(umg_id)
    private int jobmgNum;      //包名次数
    private int jobmgUndonum;  //取消次数
    private int jobmgDonum;    //录用次数
    private int jobmgUundo;    //用户取消
    private int jobmgEnundo;   //企业取消
    private int jobmgSuccess;  //已完工

    public int getJobmgId() {
        return jobmgId;
    }

    public void setJobmgId(int jobmgId) {
        this.jobmgId = jobmgId;
    }

    public int getJobmgUser() {
        return jobmgUser;
    }

    public void setJobmgUser(int jobmgUser) {
        this.jobmgUser = jobmgUser;
    }

    public int getJobmgNum() {
        return jobmgNum;
    }

    public void setJobmgNum(int jobmgNum) {
        this.jobmgNum = jobmgNum;
    }

    public int getJobmgUndonum() {
        return jobmgUndonum;
    }

    public void setJobmgUndonum(int jobmgUndonum) {
        this.jobmgUndonum = jobmgUndonum;
    }

    public int getJobmgDonum() {
        return jobmgDonum;
    }

    public void setJobmgDonum(int jobmgDonum) {
        this.jobmgDonum = jobmgDonum;
    }

    public int getJobmgUundo() {
        return jobmgUundo;
    }

    public void setJobmgUundo(int jobmgUundo) {
        this.jobmgUundo = jobmgUundo;
    }

    public int getJobmgEnundo() {
        return jobmgEnundo;
    }

    public void setJobmgEnundo(int jobmgEnundo) {
        this.jobmgEnundo = jobmgEnundo;
    }

    public int getJobmgSuccess() {
        return jobmgSuccess;
    }

    public void setJobmgSuccess(int jobmgSuccess) {
        this.jobmgSuccess = jobmgSuccess;
    }

    @Override
    public String toString() {
        return "EzdJobmg{" +
                "jobmgId=" + jobmgId +
                ", jobmgUser=" + jobmgUser +
                ", jobmgNum=" + jobmgNum +
                ", jobmgUndonum=" + jobmgUndonum +
                ", jobmgDonum=" + jobmgDonum +
                ", jobmgUundo=" + jobmgUundo +
                ", jobmgEnundo=" + jobmgEnundo +
                ", jobmgSuccess=" + jobmgSuccess +
                '}';
    }
}
