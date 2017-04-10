package com.ezd.model;

/**
 * Created by Administrator on 2017/4/6.
 * 点赞信息表
 */
public class EzdPoint {
    private int pintId;
    private EzdArticle pintArticle;// references ezd_article(article_id)
    private EzdUmg pintUmg;//references ezd_umg(umg_id)
    private int pintTouser;//为其他用户点赞
    private int poingStatus; //状态 0 1

    @Override
    public String toString() {
        return "EzdPoint{" +
                "pintId=" + pintId +
                ", pintArticle=" + pintArticle +
                ", pintUmg=" + pintUmg +
                ", pintTouser=" + pintTouser +
                ", poingStatus=" + poingStatus +
                '}';
    }

    public void setPintArticle(EzdArticle pintArticle) {
        this.pintArticle = pintArticle;
    }

    public void setPintUmg(EzdUmg pintUmg) {
        this.pintUmg = pintUmg;
    }


    public int getPintId() {
        return pintId;
    }

    public void setPintId(int pintId) {
        this.pintId = pintId;
    }

    public int getPintTouser() {
        return pintTouser;
    }

    public void setPintTouser(int pintTouser) {
        this.pintTouser = pintTouser;
    }

    public int getPoingStatus() {
        return poingStatus;
    }

    public void setPoingStatus(int poingStatus) {
        this.poingStatus = poingStatus;
    }
}
