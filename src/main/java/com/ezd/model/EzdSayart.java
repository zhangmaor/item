package com.ezd.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/6.
 * 文章评论表
 */
public class EzdSayart {
    private int sayartId;
    private int sayartArticel;//references ezd_article(article_id)
    private int sayartUmg;//references ezd_umg(umg_id)
    private String  sayartContent;//评论内容
    private int sayartTouser;//评论其他用户
    private int sayartStatus;//评论状态 需要管理员审核
    private Date sayartTIme;//评论时间

    public int getSayartId() {
        return sayartId;
    }

    public void setSayartId(int sayartId) {
        this.sayartId = sayartId;
    }

    public int getSayartArticel() {
        return sayartArticel;
    }

    public void setSayartArticel(int sayartArticel) {
        this.sayartArticel = sayartArticel;
    }

    public int getSayartUmg() {
        return sayartUmg;
    }

    public void setSayartUmg(int sayartUmg) {
        this.sayartUmg = sayartUmg;
    }

    public String getSayartContent() {
        return sayartContent;
    }

    public void setSayartContent(String sayartContent) {
        this.sayartContent = sayartContent;
    }

    public int getSayartTouser() {
        return sayartTouser;
    }

    public void setSayartTouser(int sayartTouser) {
        this.sayartTouser = sayartTouser;
    }

    public int getSayartStatus() {
        return sayartStatus;
    }

    public void setSayartStatus(int sayartStatus) {
        this.sayartStatus = sayartStatus;
    }

    public Date getSayartTIme() {
        return sayartTIme;
    }

    public void setSayartTIme(Date sayartTIme) {
        this.sayartTIme = sayartTIme;
    }
}
