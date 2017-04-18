package com.ezd.dao;

import com.ezd.model.EzdBigret;
import com.ezd.model.EzdEnmg;
import com.ezd.model.EzdNewsStatus;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdBigretDao {
    /**
     * 通过状态来获取大招会列表
     * @param ezdNewsStatus
     * @return
     * @throws Exception
     */
    public List<EzdBigret> modeGet(EzdNewsStatus ezdNewsStatus)throws Exception;

    /**
     * 通过公司的编号获取大招会信息
     * @param ezdEnmg
     * @return
     * @throws Exception
     */
    public List<EzdBigret> enmgGet(EzdEnmg ezdEnmg) throws Exception;

    /**
     * 添加一个大招会信息
     * @param ezdBigret
     * @return
     * @throws Exception
     */
    public int add(EzdBigret ezdBigret) throws Exception;

    /**
     * 修改未知的数据
     * @param ezdBigret
     * @return
     * @throws Exception
     */
    public int update(EzdBigret ezdBigret) throws Exception;

    /**
     * 修改指定的大招会的状态
     * @param ezdBigret
     * @return  -----修改的行数
     * @throws Exception
     */
    public int updateStatus(EzdBigret ezdBigret) throws Exception;

    /**
     * 通过大招会的Id获取大招会的详细信息
     * @param id
     * @return
     * @throws Exception
     */
    public EzdBigret idGet(int id)throws Exception;

    /**
     * 获取全部的大招会信息
     * @return
     * @throws Exception
     */
    public List<EzdBigret> get()throws Exception;

}
