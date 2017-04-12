package com.ezd.dao;

import com.ezd.model.EzdUmg;
import com.ezd.model.EzdUnews;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 * 消息
 */
public interface EzdUnewsDao {
    /*查询同一个用户的所有消息*/
    public List<EzdUnews> getAll (EzdUmg ezdUmg)throws Exception;
    /*通过指定的消息编号id获取详细的信息*/
    public EzdUnews getOne(int unewsId)throws Exception;
    /*修改指定的信息的状态*/
    public int updateStatus(int id) throws Exception;
    /*插入数据*/
    public int insertOne(EzdUnews ezdUnews)throws Exception;
}
