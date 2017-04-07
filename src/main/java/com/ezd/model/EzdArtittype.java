package com.ezd.model;

/**
 * Created by Administrator on 2017/4/6.
 * 文章类型
 */
public class EzdArtittype {
    private int rtitypeId ;
    private String artitypeName ;//文章类型名称

    public int getRtitypeId() {
        return rtitypeId;
    }

    public void setRtitypeId(int rtitypeId) {
        this.rtitypeId = rtitypeId;
    }

    public String getArtitypeName() {
        return artitypeName;
    }

    public void setArtitypeName(String artitypeName) {
        this.artitypeName = artitypeName;
    }
}
