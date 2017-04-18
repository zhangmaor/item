package com.ezd.dao;

import com.ezd.model.EzdEnmg;

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

}
