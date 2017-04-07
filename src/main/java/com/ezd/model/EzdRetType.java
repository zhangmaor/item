package com.ezd.model;

/**
 * Created by Administrator on 2017-04-06.
 */
public class EzdRetType {
    private int retTypeId;
    private String retTypeName;

    public int getRetTypeId() {
        return retTypeId;
    }

    public void setRetTypeId(int retTypeId) {
        this.retTypeId = retTypeId;
    }

    public String getRetTypeName() {
        return retTypeName;
    }

    public void setRetTypeName(String retTypeName) {
        this.retTypeName = retTypeName;
    }

    @Override
    public String toString() {
        return "EzdRetType{" +
                "retTypeId=" + retTypeId +
                ", retTypeName='" + retTypeName + '\'' +
                '}';
    }
}
