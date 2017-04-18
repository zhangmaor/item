package com.ezd.service;

import com.ezd.dao.EzdSayartDao;
import com.ezd.model.EzdSayart;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/17.
 */
@Service
@Transactional
public class EzdSayartService {

    @Resource
    private EzdSayartDao ezdSayartDao;

    //添加评论
    public boolean insert(EzdSayart ezdSayart){
        int insert = ezdSayartDao.insert(ezdSayart);
        if (insert>0){
            return true;
        }
        return false;

    }
    //评论别人的评论
    public boolean commentOnOthers(EzdSayart ezdSayart){
        int i = ezdSayartDao.commentOnOthers(ezdSayart);
        if (i>0){
            return true;
        }
        return false;
    }
    //删除评论
    public boolean delete(EzdSayart ezdSayart){
        int delete = ezdSayartDao.delete(ezdSayart);
        if (delete>0){
            return true;
        }
        return false;
    }
    //管理员审核评论
    public boolean update(EzdSayart ezdSayart){
        int update = ezdSayartDao.update(ezdSayart);
        if (update>0){
            return true;
        }
        return false;

    }

}
