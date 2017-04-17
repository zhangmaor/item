package com.ezd.model;

/**
 * Created by Administrator on 2017-04-06.
 */
//企业类型表
public class EzdEntype {
    private int enTypeId;
    private String enTypeName;  //企业类型名称

    public int getEnTypeId() {
        return enTypeId;
    }

    public void setEnTypeId(int enTypeId) {
        this.enTypeId = enTypeId;
    }

    public String getEnTypeNmae() {
        return enTypeName;
    }

    public void setEnTypeNmae(String enTypeName) {
        this.enTypeName = enTypeName;
    }

    @Override
    public String toString() {
        return "EzdEntype{" +
                "enTypeId=" + enTypeId +
                ", enTypeNmae='" + enTypeName + '\'' +
                '}';
    }
}
