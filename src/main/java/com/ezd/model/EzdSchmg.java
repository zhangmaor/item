package com.ezd.model;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017-04-06.
 */
//学校信息表
public class EzdSchmg {
    private int schmgId;
    private String schmgDomain;    // 学校网址
    private String schmgName ;     //学校名称
    private String schmgMg;        //学校详情
    private String schmgAddress;   //学校地址
    private int typeId;  //学校性质ID
    private EzdSchtype schmgType;         //学校性质
    private Date schmgCretime;     //学校成立时间
    private List<EzdBigret> ezdBigrets;//在本学校举行的校招会

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public List<EzdBigret> getEzdBigrets() {
        return ezdBigrets;
    }

    public void setEzdBigrets(List<EzdBigret> ezdBigrets) {
        this.ezdBigrets = ezdBigrets;
    }

    @Override
    public String toString() {
        return "EzdSchmg{" +
                "schmgId=" + schmgId +
                ", schmgDomain='" + schmgDomain + '\'' +
                ", schmgName='" + schmgName + '\'' +
                ", schmgMg='" + schmgMg + '\'' +
                ", schmgAddress='" + schmgAddress + '\'' +
                ", schmgType=" + schmgType +
                ", schmgCretime=" + schmgCretime +
                ", ezdSchrets=" + ezdBigrets +
                '}';
    }

    public List<EzdBigret> getEzdSchrets() {
        return ezdBigrets;
    }

    public void setEzdSchrets(List<EzdBigret> ezdBigrets) {
        this.ezdBigrets = ezdBigrets;
    }

    public int getSchmgId() {
        return schmgId;
    }

    public void setSchmgId(int schmgId) {
        this.schmgId = schmgId;
    }

    public String getSchmgDomain() {
        return schmgDomain;
    }

    public void setSchmgDomain(String schmgDomain) {
        this.schmgDomain = schmgDomain;
    }

    public String getSchmgName() {
        return schmgName;
    }

    public void setSchmgName(String schmgName) {
        this.schmgName = schmgName;
    }

    public String getSchmgMg() {
        return schmgMg;
    }

    public void setSchmgMg(String schmgMg) {
        this.schmgMg = schmgMg;
    }

    public String getSchmgAddress() {
        return schmgAddress;
    }

    public void setSchmgAddress(String schmgAddress) {
        this.schmgAddress = schmgAddress;
    }

    public EzdSchtype getSchmgType() {
        return schmgType;
    }

    public void setSchmgType(EzdSchtype schmgType) {
        this.schmgType = schmgType;
    }

    public Date getSchmgCretime() {
        return schmgCretime;
    }

    public void setSchmgCretime(Date schmgCretime) {
        this.schmgCretime = schmgCretime;
    }

}
