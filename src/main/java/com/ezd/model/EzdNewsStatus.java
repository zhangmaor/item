package com.ezd.model;

/**
 * Created by Administrator on 2017/4/6.
 * 消息状态表的实体类
 */
public class EzdNewsStatus {
    private int newsStatusId;//编号
    private String newsStatusName;//消息状态

    public int getNewsStatusId() {
        return newsStatusId;
    }

    public EzdNewsStatus() {
    }

    @Override
    public String toString() {
        return "EzdNewsStatus{" +
                "newsStatusId=" + newsStatusId +
                ", newsStatusName='" + newsStatusName + '\'' +
                '}';
    }

    public void setNewsStatusId(int newsStatusId) {
        this.newsStatusId = newsStatusId;
    }

    public String getNewsStatusName() {
        return newsStatusName;
    }

    public void setNewsStatusName(String newsStatusName) {
        this.newsStatusName = newsStatusName;
    }
}
