package com.ezd.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/6.
 * 文章阅读信息表
 */
public class EzdReadarti {
    private int readartiId;
    private int readartiArticle;//references ezd_article(article_id)
    private int readartiUser;//references ezd_umg(umg_id)
    private Date readartiTime;//阅读时间

    public int getReadartiId() {
        return readartiId;
    }

    public void setReadartiId(int readartiId) {
        this.readartiId = readartiId;
    }

    public int getReadartiArticle() {
        return readartiArticle;
    }

    public void setReadartiArticle(int readartiArticle) {
        this.readartiArticle = readartiArticle;
    }

    public int getReadartiUser() {
        return readartiUser;
    }

    public void setReadartiUser(int readartiUser) {
        this.readartiUser = readartiUser;
    }

    public Date getReadartiTime() {
        return readartiTime;
    }

    public void setReadartiTime(Date readartiTime) {
        this.readartiTime = readartiTime;
    }
}
