package com.ezd.model;

/**
 * Created by Administrator on 2017/4/6.
 * 点赞信息表
 */
public class EzdPoing {
    private int pintId;
    private int pintArticle;// references ezd_article(article_id)
    private int  pintUmg;//references ezd_umg(umg_id)
    private int pintTouser;//为其他用户点赞
    private int poingStatus; //状态 0 1

    public int getPintId() {
        return pintId;
    }

    public void setPintId(int pintId) {
        this.pintId = pintId;
    }

    public int getPintArticle() {
        return pintArticle;
    }

    public void setPintArticle(int pintArticle) {
        this.pintArticle = pintArticle;
    }

    public int getPintUmg() {
        return pintUmg;
    }

    public void setPintUmg(int pintUmg) {
        this.pintUmg = pintUmg;
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
