package com.ezd.dao;

import com.ezd.model.EzdEnretBrowse;
import com.ezd.model.EzdUmg;
import com.ezd.model.EzdUsers;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdUmgDao {

    //查询所有个人信息
    public List<EzdUmg> getAll(EzdUsers ezdUsers);

    //根据umg_id查询出个人信息
    public EzdUmg getEzdUmgAll(int umgId);


    //添加个人信息
    public int insetAll(EzdUmg ezdUmg);

    //更新个人信息
    public int upAll(EzdUmg ezdUmg);
    //根据浏览信息的查询用户
    public List<EzdUmg> getBrowsingUsers(EzdEnretBrowse ezdEnretBrowse);

}
