package com.ezd.model;

/**
 * Created by Administrator on 2017/4/6.
 */
public class EzdRestatus {
    private int restatusId;//编号
    private String restatusName;//状态 ；已报名，审核，录用，拒绝

    public int getRestatusId() {
        return restatusId;
    }

    public void setRestatusId(int restatusId) {
        this.restatusId = restatusId;
    }

    public String getRestatusName() {
        return restatusName;
    }

    public void setRestatusName(String restatusName) {
        this.restatusName = restatusName;
    }

    public EzdRestatus() {
    }

    @Override
    public String toString() {
        return "EzdRestatus{" +
                "restatusId=" + restatusId +
                ", restatusName='" + restatusName + '\'' +
                '}';
    }
}
