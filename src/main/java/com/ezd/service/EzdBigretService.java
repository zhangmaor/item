package com.ezd.service;

import com.ezd.dao.EzdBigretDao;
import com.ezd.model.EzdBigret;
import com.ezd.model.EzdEnmg;
import com.ezd.model.EzdNewsStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/4/16.
 * 对大招会的一些操作
 */
@Service
@Transactional
public class EzdBigretService {
    @Resource
    private EzdBigretDao ezdBigretDao;

    /**
     * 根据传递过来的参数statusId进行大招会的的查询
     *
     * @param statusId ------是一个状态值（即EzdNewStatus类的编号id）
     * @return   ------- 符合条件的大招会列表
     */
    public List<EzdBigret> modeGet(int statusId) {
        EzdNewsStatus ezdNewsStatus = new EzdNewsStatus();
        ezdNewsStatus.setNewsStatusId(statusId);
        List<EzdBigret> bigretList = null;
        try {
            bigretList = ezdBigretDao.modeGet(ezdNewsStatus);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bigretList;
    }

    /**
     * 通过公司的编号id来获取大招会列表
     * @param enmgId
     * @return
     */
    public List<EzdBigret> enmgGet(int enmgId){
        List<EzdBigret> bigretList = null;
        EzdEnmg ezdEnmg = new EzdEnmg();
        ezdEnmg.setEnmgId(enmgId);
        try {
            bigretList = ezdBigretDao.enmgGet(ezdEnmg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bigretList;
    }

    /**
     * 修改数据
     * @param ezdBigret ------要修改的部分
     * @param bigretId  ------ 当前的大招会的编号ID
     * @return --------- 是否修改成功
     *     false ------- 修改失败
     *     true  ------- 修改成功
     */
    public boolean update(EzdBigret ezdBigret,int bigretId){
        //ezdBigret----是修改的数据
        int up = 0;
        try {
            EzdBigret ezdBigret1 = ezdBigretDao.idGet(bigretId);//修改前的数据
            if(ezdBigret.getBigretAddress()!=null){
                ezdBigret1.setBigretAddress(ezdBigret.getBigretAddress());
            }
            if(ezdBigret.getBigretDetail()!=null){
                ezdBigret1.setBigretDetail(ezdBigret.getBigretDetail());
            }
            if(ezdBigret.getBigretEnmg()!=null){
                ezdBigret1.setBigretEnmg(ezdBigret.getBigretEnmg());
            }
            if(ezdBigret.getBigretLogo()!=null){
                ezdBigret1.setBigretLogo(ezdBigret.getBigretLogo());
            }
            if(ezdBigret.getEzdPostOne()!=null){
                ezdBigret1.setEzdPostOne(ezdBigret.getEzdPostOne());
            }
            if(ezdBigret.getEzdPostTwo()!=null){
                ezdBigret1.setEzdPostTwo(ezdBigret.getEzdPostTwo());
            }
            if(ezdBigret.getBigretStatus()!=null){
                ezdBigret1.setBigretStatus(ezdBigret.getBigretStatus());
            }
            if(ezdBigret.getBigretTime()!=null){
                ezdBigret1.setBigretTime(ezdBigret.getBigretTime());
            }
            if(ezdBigret.getBigretTitle()!=null){
                ezdBigret1.setBigretTitle(ezdBigret.getBigretTitle());
            }
            up = ezdBigretDao.update(ezdBigret1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return up>0;
    }

    /**
     * 修改指定的大招会的状态
     * @param status  ----- 状态编号
     * @param id   ----- 指定的大招会的编号ID
     * @return  ----- 是否修改成功
     * false ----修改成功
     * true ----- 修改失败
     */
    public boolean updateStatus(int status,int id){
        EzdNewsStatus ezdNewsStatus = new EzdNewsStatus();
        ezdNewsStatus.setNewsStatusId(status);
        EzdBigret ezdBigret = new EzdBigret();
        ezdBigret.setBigretStatus(ezdNewsStatus);
        ezdBigret.setBigretId(id);
        int i = 0;
        try {
            i = ezdBigretDao.updateStatus(ezdBigret);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i > 0;
    }

    /**
     * 添加一个大招会！！！
     * @param ezdBigret
     * @return
     */
    public boolean add(EzdBigret ezdBigret){
        int result = 0;
        try {
             result = ezdBigretDao.add(ezdBigret);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result>0;
    }

    /**
     * 通过id来获取详细的信息
     * app显示
     * 后台大招会信息的修改都需要获取这些数据
     * @param id
     * @return
     */
    public EzdBigret get(int id){
        EzdBigret ezdBigret = null;
        try {
            ezdBigret= ezdBigretDao.idGet(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ezdBigret;
    }
}
