package com.ezd.dao;

import com.ezd.model.EzdPostTwo;

import java.util.List;

/**
 * Created by Administrator on 2017/4/17.
 */
public interface EzdPostTwoDao {

    /**
     * 根据一级岗位查询出二级岗位
     * @param pone_id
     * @return
     */
    public EzdPostTwo findPostTwo(int pone_id);
    /**
     * 根据一级岗位查询出二级岗位
     * @param pone_id
     * @return
     */
    public List<EzdPostTwo> getPostTwo(int pone_id);
}
