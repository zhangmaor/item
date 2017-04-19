package com.ezd.model;

import java.util.Date;

/**
 * Created by Administrator on 2017-04-06.
 */
//用户消息表
public class EzdUnews {
    private int unewsId;
    private int unewsUser;     // int references ezd_umg(umg_id),-- 受信人--用户信息
    private String unewsFrom;  //（默认系统） 发件人
    private String unewsContent;//信件内容
    private Date unewsTime;
    private int unewsStatus;//int default(unews_status=0 or unews_status=1 )--消息状态（0未读 1已读）

    public String getUnewsContent() {
        return unewsContent;
    }

    @Override
    public String toString() {
        return "EzdUnews{" +
                "unewsId=" + unewsId +
                ", unewsUser=" + unewsUser +
                ", unewsFrom='" + unewsFrom + '\'' +
                ", unewsContent='" + unewsContent + '\'' +
                ", unewsTime=" + unewsTime +
                ", unewsStatus=" + unewsStatus +
                '}';
    }

    public Date getUnewsTime() {
        return unewsTime;
    }

    public void setUnewsTime(Date unewsTime) {
        this.unewsTime = unewsTime;
    }

    public void setUnewsContent(String unewsContent) {
        this.unewsContent = unewsContent;
    }




    public int getUnewsId() {
        return unewsId;
    }

    public void setUnewsId(int unewsId) {
        this.unewsId = unewsId;
    }

    public int getUnewsUser() {
        return unewsUser;
    }

    public void setUnewsUser(int unewsUser) {
        this.unewsUser = unewsUser;
    }

    public String getUnewsFrom() {
        return unewsFrom;
    }

    public void setUnewsFrom(String unewsFrom) {
        this.unewsFrom = unewsFrom;
    }

    public int getUnewsStatus() {
        return unewsStatus;
    }

    public void setUnewsStatus(int unewsStatus) {
        this.unewsStatus = unewsStatus;
    }

}
