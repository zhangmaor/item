package com.ezd.service;

import com.ezd.dao.EzdBigretDao;
import com.ezd.dao.EzdEnmgDao;
import com.ezd.dao.EzdSchmgDao;
import com.ezd.dao.EzdUmindenDao;
import com.ezd.model.EzdBigret;
import com.ezd.model.EzdEnmg;
import com.ezd.model.EzdSchmg;
import com.ezd.model.EzdUminden;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

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
    @Resource
    private EzdBigretDao ezdBigretDao;

    private  List<EzdSchmg> schmgs = new ArrayList<EzdSchmg>() ;



    public List<EzdSchmg> findAll(){

        try{
            schmgs = ezdSchmgDao.findAll();

            for(EzdSchmg sch :schmgs ){

                //通过学校的ID 查询 对应的 大招会
                System.out.println(sch.getSchmgId());
                List<EzdBigret>  ezdBigrets = ezdBigretDao.addressGet(sch.getSchmgId());
             /*   System.out.println("ezdBigret===="+ ezdBigrets);*/
                sch.setEzdBigrets(ezdBigrets);
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("=======EzdSchmgService findSchmgById method========");
        }
        return schmgs;
    }




    /**
     *
     * @param ezdSchmg 学校信息
     *  findSchmgById 根据id找学校信息
     */

    public List<EzdSchmg> findSchmg(EzdSchmg ezdSchmg){
       List<EzdSchmg>  schmgs = null;
        try{
            schmgs = ezdSchmgDao.findSchmg(ezdSchmg);
                for(EzdSchmg sch :schmgs ){

                    //通过学校的ID 查询 对应的 大招会
                    List<EzdBigret>  ezdBigrets = ezdBigretDao.addressGet(sch.getSchmgId());

                    sch.setEzdBigrets(ezdBigrets);
                }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("=======EzdSchmgService findSchmgById method========");

        }

        return schmgs;
    }



    public  EzdSchmg findById(int id){
        EzdSchmg ezdSchmg =  new EzdSchmg();
        try{
            ezdSchmg = ezdSchmgDao.findById(id);

            //通过学校的ID 查询 对应的 大招会
            List<EzdBigret>  ezdBigrets = ezdBigretDao.addressGet(ezdSchmg.getSchmgId());
            ezdSchmg.setEzdBigrets(ezdBigrets);

        }catch (Exception e){
            e.printStackTrace();
        }
        return ezdSchmg;
    }

    /**
     *
     * @param ezdSchmg 学校信息对象
     * 该对象的 学校性质属性类型需要注意！！！！！！！！！！！！！！！！！
     */

    public boolean updateSchmg(EzdSchmg ezdSchmg){
        System.out.println("updateSchmg==="+ezdSchmg);
        boolean a = false;
        int i=0;
        try{
            i = ezdSchmgDao.updateSchmg(ezdSchmg);
            a = i>0;
        }catch (Exception e){

            e.printStackTrace();
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
            System.out.println("=====insert==="+i);
            a = i>0;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("=======EzdSchmgService insertSchmg method========");
        }
        return a;
    }

    public boolean del(int schmgId){
        boolean i = false;
        try{
            i = ezdSchmgDao.del(schmgId) > 0;
        }catch (Exception e){
            System.out.println("========this is EzdSchmgService > del method=========");
            e.printStackTrace();
        }
        System.out.println("boolean========="+i);
        return i;
     }

}
