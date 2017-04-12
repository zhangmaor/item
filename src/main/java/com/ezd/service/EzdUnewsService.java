package com.ezd.service;

import com.ezd.dao.EzdUnewsDao;
import com.ezd.model.EzdUmg;
import com.ezd.model.EzdUnews;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/4/11.
 */
@Service
@Transactional
public class EzdUnewsService {
    @Resource
    private EzdUnewsDao ezdUnewsDao;

    /**
     * 通过当前用户的id获取当前用户的全部消息
     *
     * @param umgId-------当前用户的id(编号)
     * @return ------当前用户的消息列表
     * 如果返回值为null就是获取数据库出差
     * 或者当前用户还没有收到信息
     */
    public List<EzdUnews> displayUnews(int umgId) {
        EzdUmg ezdUmg = new EzdUmg();
        ezdUmg.setUmgId(umgId);
        List<EzdUnews> all = null;
        try {
            all = ezdUnewsDao.getAll(ezdUmg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }

    /**
     * 向指定的用户发送一条消息
     *
     * @param ezdUnews-------消息（里面包括了内容和收信的对象）
     * @return ---------返回boolean值
     * true ------- 发送消息成功
     * false ------- 发送消息失败
     */
    public boolean add(EzdUnews ezdUnews) {
        if (ezdUnews.getUnewsTime() == null) {
            ezdUnews.setUnewsTime(new Date());
        }
        int i = 0;
        try {
            i = ezdUnewsDao.insertOne(ezdUnews);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i > 0;
    }

    /**
     * 批量阅读消息
     *
     * @param unewsList -----一批消息的id(编号)
     * @return 非零-------返回值受影响的行，即最终批处理了多少的信息
     * 0 -------即传过来的参数 unewsList 出问题（为空等）
     * -1 ----- 即修改数据库的时候出现了错误！！
     */
    public int update(List<Integer> unewsList) {
        int result = 0;
        if (unewsList != null) {
            for (int i = 0; i < unewsList.size(); i++) {
                try {
                    int count = ezdUnewsDao.updateStatus(unewsList.get(i));
                    result += count;
                } catch (Exception e) {
                    result = -1;
                    e.printStackTrace();
                    break;
                }
            }
        }
        return result;
    }

    /**
     * 通过指定消息的编号id获取该消息的详细信息
     *
     * @param unewsId ----- 一条消息的编号id
     * @return   -----返回的是这条消息的详细信息
     *         null ----- 如果返回值是空的话那么即查询出错！
     */
    public EzdUnews getUnews(int unewsId){
        EzdUnews ezdUnews = null;
        try {
            ezdUnews = ezdUnewsDao.getOne(unewsId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ezdUnews;
    }
}
