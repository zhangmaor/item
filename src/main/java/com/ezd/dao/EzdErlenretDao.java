package com.ezd.dao;

import com.ezd.model.EzdEnret;
import com.ezd.model.EzdErlenret;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdErlenretDao {

    //根据招聘信息查出报名的人
    public List<EzdErlenret> getPersonEnrolled(EzdEnret ezdEnret);

    //查询出所有的报名信息
    public List<EzdErlenret> getAll();

    //根据时间查询最近报名的人
    public List<EzdErlenret> getTimeAll(EzdEnret ezdEnret);
/*修改状态*/
    public int updateStatus(EzdErlenret ezdErlenret)throws Exception;

    public EzdErlenret getOne(int erlenretId)throws Exception;
    /*添加一条数据招聘信息报名表*/
    public int add(EzdErlenret ezdErlenret)throws Exception;

    public List<EzdErlenret> getOntUmg(int umgId)throws Exception;

    public int getCount(EzdErlenret ezdErlenret)throws Exception;

}
