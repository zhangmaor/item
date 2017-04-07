package com.ezd.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/6.
 * 文章阅读信息表
 */
public class EzdReadarti {
    private int readartiId;
    private EzdArticle readartiArticle;//references ezd_article(article_id)
    private EzdUmg readartiUser;//references ezd_umg(umg_id)
    private Date readartiTime;//阅读时间

    public int getReadartiId() {
        return readartiId;
    }

    public void setReadartiId(int readartiId) {
        this.readartiId = readartiId;
    }

    @Override
    public String toString() {
        return "EzdReadarti{" +
                "readartiId=" + readartiId +
                ", readartiArticle=" + readartiArticle +
                ", readartiUser=" + readartiUser +
                ", readartiTime=" + readartiTime +
                '}';
    }

    public EzdArticle getReadartiArticle() {
        return readartiArticle;
    }

    public void setReadartiArticle(EzdArticle readartiArticle) {
        this.readartiArticle = readartiArticle;
    }

    public EzdUmg getReadartiUser() {
        return readartiUser;
    }

    public void setReadartiUser(EzdUmg readartiUser) {
        this.readartiUser = readartiUser;
    }

    public Date getReadartiTime() {
        return readartiTime;
    }

    public void setReadartiTime(Date readartiTime) {
        this.readartiTime = readartiTime;
    }
}
