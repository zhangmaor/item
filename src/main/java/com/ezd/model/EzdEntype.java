package com.ezd.model;

/**
 * Created by Administrator on 2017-04-06.
 */
//企业类型表
public class EzdEntype {
    private int entityId;
    private String entityName;  //企业类型名称

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    @Override
    public String toString() {
        return "EzdEntype{" +
                "entityId=" + entityId +
                ", entityName='" + entityName + '\'' +
                '}';
    }
}
