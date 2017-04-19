package com.ezd.service;

import com.ezd.dao.EzdEnmgDao;
import com.ezd.model.EzdEnmg;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/4/18.
 * 对企业的一些方法的封装整合
 *
 *
 */
@Service
@Transactional
public class EzdEnmgService {
    @Resource
    private EzdEnmgDao ezdEnmgDao;

    /**
     * 添加一个企业
     * @param ezdEnmg
     * @return
     */
    public boolean add(EzdEnmg ezdEnmg){
        int add = 0;
        try {
            add = ezdEnmgDao.add(ezdEnmg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return add > 0;
    }

    /**
     * 获取全部的信息。。。。
     * @return
     */
    public List<EzdEnmg> getAll(){
        List<EzdEnmg> ezdEnmgList = null;
        try {
            ezdEnmgList = ezdEnmgDao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ezdEnmgList;
    }

    /**
     * 修改企业信息
     * @param e1 ----- 该企业原来的新
     * @param e2 ----- 需要修改的部分信息
     * @return   ----- 是否修改成功！！！
     */
    public boolean update(EzdEnmg e1,EzdEnmg e2){
        int count = 0;
        if(e2.getEnmgAddress()==null){
            e2.setEnmgAddress(e1.getEnmgAddress());
        }
        if(e2.getEnmgCretime()==null){
            e2.setEnmgCretime(e1.getEnmgCretime());
        }
        if(e2.getEnmgDetail()==null){
            e2.setEnmgDetail(e1.getEnmgDetail());
        }
        if(e2.getEnmgDomain()==null){
            e2.setEnmgDomain(e1.getEnmgDomain());
        }
        if(e2.getEnmgLogo()==null){
            e2.setEnmgLogo(e1.getEnmgLogo());
        }
        if(e2.getEnmgName()==null){
            e2.setEnmgName(e1.getEnmgName());
        }
        if(e2.getEnmgScale()==null){
            e2.setEnmgScale(e1.getEnmgScale());
        }
        if(e2.getEnmgUser()==null){
            e2.setEnmgUser(e1.getEnmgUser());
        }
        try {
            count = ezdEnmgDao.update(e2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count>0;
    }

    /**
     * 通过企业的编号ID获取指定的企业的信息
     * @param id
     * @return
     */
    public EzdEnmg getEnmg(int id){
        EzdEnmg ezdEnmg = null;
        try {
            ezdEnmg = ezdEnmgDao.getEnmg(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ezdEnmg;
    }

}
