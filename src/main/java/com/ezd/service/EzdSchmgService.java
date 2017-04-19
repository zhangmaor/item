package com.ezd.service;

import com.ezd.dao.EzdEnmgDao;
import com.ezd.dao.EzdSchmgDao;
import com.ezd.dao.EzdUmindenDao;
import com.ezd.model.EzdEnmg;
import com.ezd.model.EzdSchmg;
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
public class EzdSchmgService {

    @Resource
    private EzdSchmgDao ezdSchmgDao;



    public List<EzdSchmg> findAll(){
        List<EzdSchmg> schmgs = new ArrayList<EzdSchmg>() ;
        try{
            schmgs = ezdSchmgDao.findAll();
        }catch (Exception e){
            System.out.println("=======EzdSchmgService findSchmgById method========");
        }
        return schmgs;
    }




    /**
     *
     * @param schmg_id 学校信息的ID
     *  findSchmgById 根据id找学校信息
     */

    public EzdSchmg findSchmgById(int schmg_id){
        EzdSchmg schmg = new EzdSchmg();
        try{
            schmg = ezdSchmgDao.findSchById(schmg_id);
        }catch (Exception e){
            System.out.println("=======EzdSchmgService findSchmgById method========");
        }
        return schmg;
    }

    /**
     *
     * @param ezdSchmg 学校信息对象
     * 该对象的 学校性质属性类型需要注意！！！！！！！！！！！！！！！！！
     */

    public boolean updateSchmg(EzdSchmg ezdSchmg){
        boolean a = false;
        int i=0;
        try{
            i = ezdSchmgDao.updateSchmg(ezdSchmg);
            a = i>0;
        }catch (Exception e){
            System.out.println("=======EzdSchmgService updateSchmg method========");
        }
        return a;
    }

    /**
     *
     * @param ezdSchmg 学校信息对象
     * 该对象的 学校性质属性类型需要注意！！！！！！！！！！！！！！！！！
     */
    public boolean insertSchmg(EzdSchmg ezdSchmg){
        boolean a = false;
        int i=0;
        try{
            i = ezdSchmgDao.insertSchmg(ezdSchmg);
            a = i>0;
        }catch (Exception e){
            System.out.println("=======EzdSchmgService insertSchmg method========");
        }
        return a;
    }

}
