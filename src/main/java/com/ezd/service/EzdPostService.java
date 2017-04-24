package com.ezd.service;

import com.ezd.dao.EzdPostOneDao;
import com.ezd.dao.EzdPostTwoDao;
import com.ezd.model.EzdPostOne;
import com.ezd.model.EzdPostTwo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/4/24.
 */
@Service
@Transactional
public class EzdPostService {

    @Resource
    private EzdPostOneDao ezdPostOneDao;
    @Resource
    private EzdPostTwoDao ezdPostTwoDao;

    /**
     * 查询出所有的一级岗位
     * @return
     */
    public List<EzdPostOne> findPostOne() throws Exception {
        List<EzdPostOne> list = ezdPostOneDao.findPostOne();
        return list;
    }

    /**
     * 根据一级岗位查询出二级岗位
     * @param pone_id
     * @return
     */
    public List<EzdPostTwo> getPostTwo(int pone_id){
        List<EzdPostTwo> list = ezdPostTwoDao.getPostTwo(pone_id);
        return list;
    }
}
