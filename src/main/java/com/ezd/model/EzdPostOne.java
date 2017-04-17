package com.ezd.model;

/**
 * Created by Administrator on 2017/4/17.
 * 一级招聘类型表
 */
public class EzdPostOne {

    private int poneId ; //INT PRIMARY KEY AUTO_INCREMENT,
    private String  poneName; // VARCHAR(20) NOT NULL

    public int getPoneId() {
        return poneId;
    }

    public void setPoneId(int poneId) {
        this.poneId = poneId;
    }

    public String getPoneName() {
        return poneName;
    }

    public void setPoneName(String poneName) {
        this.poneName = poneName;
    }

    @Override
    public String toString() {
        return "EzdPostOne{" +
                "poneId=" + poneId +
                ", poneName='" + poneName + '\'' +
                '}';
    }
}
