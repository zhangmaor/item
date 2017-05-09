package com.ezd.model;

/**
 * Created by Administrator on 2017/4/6.
 * 文章类型
 */
public class EzdArtittype {
    private int artitypeId ;
    private String artitypeName ;//文章类型名称

    public int getRtitypeId() {
        return artitypeId;
    }

    public void setRtitypeId(int artitypeId) {
        this.artitypeId = artitypeId;
    }

    public String getArtitypeName() {
        return artitypeName;
    }

    public void setArtitypeName(String artitypeName) {
        this.artitypeName = artitypeName;
    }
}
