package com.ezd.service;

import com.ezd.dao.EzdEnmgDao;
import com.ezd.dao.EzdUmindenDao;
import com.ezd.model.EzdEnmg;
import com.ezd.model.EzdUminden;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/12.
 * 关于关注的的实现service
 * 显示企业详细信息
 * 显示我的关注列表
 */
@Service
@Transactional
public class ConcernService {
    @Resource
    private EzdEnmgDao ezdEnmgDao;
    @Resource
    private EzdUmindenDao ezdUmindenDao;

    /**
     * 这里进行里两类查询首先 通过当前用户id获取到了关注了的企业的ID列表
     * 再循环通过企业的ID获取这个企业的详细信息
     * 最后返回的是一个企业信息的列表
     *
     * @param umgId -----当前用户的编号ID
     * @return ------ 企业信息列表
     */
    public List<EzdEnmg> getEnmgList(int umgId) {
        List<EzdEnmg> ezdEnmgs = new ArrayList<EzdEnmg>();
        try {
            List<EzdUminden> umindens = ezdUmindenDao.getEnmgId(umgId);
            for (EzdUminden e : umindens
                    ) {
                EzdEnmg enmg = ezdEnmgDao.getEnmg(e.getUmindenEn());
                ezdEnmgs.add(enmg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ezdEnmgs;
    }

    /**
     * 点击的时候显示企业的详细信息
     *
     * @param enmgId  --------- 企业编号ID
     * @return  ---------  返回一个企业的详细信息
     *     null  --------   空的话即查询出了问题
     */
    public EzdEnmg getEnmg(int enmgId) {
        EzdEnmg ezdEnmg = null;
        try {
            ezdEnmg = ezdEnmgDao.getEnmg(enmgId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ezdEnmg;
    }

    /**
     * 检查关注
     * 进入企业详情的时候需要检查数据库中是否有该用户对该企业的关注
     * 有的话在页面显示————已关注（按钮）
     * 没有的话在页面显示 ————关注（按钮）
     * @param ezdUminden ————关系表
     * @return ————返回的结果值代表的是是否关注
     *      true——  已经关注（在页面上应该显示 “关注”）
     *      false—— 未关注（在页面上就应该显示“关注”）
     */
    public boolean check(EzdUminden ezdUminden){
        int result = 0;
        try {
            result =  ezdUmindenDao.check(ezdUminden);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result>0;
    }

    /**
     * 添加一条关注
     * 在添加之前先在数据库中检查（有没有当前用户关注该企业的记录）
     * 有的话-----就不添加
     * @param ezdUminden
     * @return
     */
    public boolean add(EzdUminden ezdUminden){
        int result = 0;
        try {
            int check = ezdUmindenDao.check(ezdUminden);//返回的值是检查到了多少个匹配的
            if(check==0){
                result = ezdUmindenDao.add(ezdUminden);
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = -1;
        }
        return result>0;
    }

    /**
     * 这个是取消关注的完整方法
     * 在取消前检查是否有这个关注
     * 有的话就执行删除的方法
     * 否则的话就不执行
     * @param ezdUminden—————关注的关系
     * @return  —————— 是否成功取消关注
     *    true ————  成功取消关注
     *    false ———— 取消关注失败
     */
    public boolean del(EzdUminden ezdUminden){
        int result = 0;
        try {
            int check = ezdUmindenDao.check(ezdUminden);//返回的值就是代表是否被关注(1——关注；否则：未关注)
            if(check>0){
                result = ezdUmindenDao.del(ezdUminden);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result>0;
    }

    /**
     * 这个是获取指定的企业的关注量
     * 主要是管理员使用
     * @param enmgId ------企业的编号ID
     * @return  ------关注量
     */
    public int getConcernNum(int enmgId){
        int i = 0 ;
        try {
            i = ezdUmindenDao.getConcernNum(enmgId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;

    }
}
