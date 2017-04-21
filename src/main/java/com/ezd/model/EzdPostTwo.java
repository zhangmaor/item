package com.ezd.model;

/**
 * Created by Administrator on 2017/4/17.
 * 二级招聘类型表
 */
public class EzdPostTwo {
    private int  ptwoId; //INT PRIMARY KEY AUTO_INCREMENT,
    private EzdPostOne ezdPostOne; // INT ,
    private String ptwoName; // VARCHAR(20)
    private int postOneId;

    public int getPostOneId() {
        return postOneId;
    }

    public void setPostOneId(int postOneId) {
        this.postOneId = postOneId;
    }

    public int getPtwoId() {
        return ptwoId;
    }

    public void setPtwoId(int ptwoId) {
        this.ptwoId = ptwoId;
    }

    public EzdPostOne getEzdPostOne() {
        return ezdPostOne;
    }

    public void setEzdPostOne(EzdPostOne ezdPostOne) {
        this.ezdPostOne = ezdPostOne;
    }

    public String getPtwoName() {
        return ptwoName;
    }

    public void setPtwoName(String ptwoName) {
        this.ptwoName = ptwoName;
    }

    @Override
    public String toString() {
        return "EzdPostTwo{" +
                "ptwoId=" + ptwoId +
                ", ezdPostOne=" + ezdPostOne +
                ", ptwoName='" + ptwoName + '\'' +
                ", postOneId=" + postOneId +
                '}';
    }
}
