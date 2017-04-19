package com.ezd.dao;

import com.ezd.model.EzdEnmg;
import com.ezd.model.EzdEnret;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdEnmgDao {
    /*通过id获取详细的公司信息*/
    public EzdEnmg getEnmg(int enmgId)throws Exception;

    /**
     * 修改企业的一些基本信息
     * @param ezdEnmg
     * @return
     * @throws Exception
     */
    public int update(EzdEnmg ezdEnmg) throws Exception;

    /**
     * 添加一个企业
     *
     * @param ezdEnmg
     * @return
     * @throws Exception
     */
    public int add(EzdEnmg ezdEnmg) throws Exception;

    /**
     * 查询全部的企业信息
     * @return
     * @throws Exception
     */
    public List<EzdEnmg> getAll()throws  Exception;

    /**
     * 根据企业类型进行查询企业
     * @param typeId
     * @return
     * @throws Exception
     */
    public List<EzdEnmg> typeGet(int typeId)throws Exception;

    /**
     * 根据企业的区域进行查询企业
     * @param address  -----字符串区域
     * @return
     * @throws Exception
     */
    public List<EzdEnmg> addressGet(String address)throws Exception;

    /**
     * 根据行业类型进行企业的查询
     * @param industryGetId
     * @return
     * @throws Exception
     */
    public List<EzdEnmg> industryGet(int industryGetId)throws Exception;
}
