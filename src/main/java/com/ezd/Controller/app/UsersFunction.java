package com.ezd.Controller.app;

import com.ezd.model.EzdEnmg;
import com.ezd.model.EzdUminden;
import com.ezd.model.EzdUnews;
import com.ezd.service.ConcernService;
import com.ezd.service.EzdUnewsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2017/4/11.
 */
@Controller
@RequestMapping("/user")
public class UsersFunction {
    @Resource
    private EzdUnewsService ezdUnewsService;
    @Resource
    private ConcernService concernService;

    /*===============消息========================*/
    /*获取当前用户下的全部的消息列表
    * 可以多次使用
    * */
    @RequestMapping(value = "/ajaxUnews", method = RequestMethod.POST)
    @ResponseBody
    public List<EzdUnews> getUnewsList(HttpServletResponse response, int umgId) {
        List<EzdUnews> ezdUnewss = ezdUnewsService.displayUnews(umgId);
       return ezdUnewss;
    }


    /*通过指定的消息编号获取该消息的详细信息*/
    @RequestMapping(value = "/ajaxGetOne", method = RequestMethod.POST)
    @ResponseBody
    public EzdUnews getUnews(HttpServletResponse response, int unewsId) {
        EzdUnews unews = ezdUnewsService.getUnews(unewsId);
       return unews;
    }
    @RequestMapping(value="/ajaxGetCount" ,method = RequestMethod.POST)
    @ResponseBody
    public int getCount(HttpServletResponse response,int userId){
        int count = ezdUnewsService.getCount(userId);
        return count;
    }

    /*=======================关注================================*/

    /*显示我的关注里面的关注列表*/
    @RequestMapping(value = "/ajaxGetConcern", method = RequestMethod.POST)
    @ResponseBody
    public List<EzdEnmg> getConcern(HttpServletResponse response, int umgId) {
        List<EzdEnmg> enmgList = concernService.getEnmgList(umgId);
       return enmgList;
    }

    /**
     * 点击一个企业列表显示该企业的详细信息
     * 或者在我的关注中点击一个企业显示也可以调用此方法
     * 或者在我的关注中点击一个企业显示也可以调用此方法
     */
    @RequestMapping(value = "/ajaxGetEnmg", method = RequestMethod.POST)
    @ResponseBody
    public EzdEnmg getEnmg(HttpServletResponse response, int enmgId) {
        EzdEnmg enmg = concernService.getEnmg(enmgId);
        return enmg;
    }

    /* 检查当前的用户是否关注该企业
     *返回值
     *    true ——  关注了；
     *   false —— 没关注；
     * */
    @RequestMapping(value = "/ajaxCheck", method = RequestMethod.POST)
    @ResponseBody
    public boolean checkConcern(HttpServletResponse response, EzdUminden ezdUminden) {
        boolean check = concernService.check(ezdUminden);
       return check;
    }

    /**
     * 添加一条数据
     * @param response
     * @param ezdUminden
     * @return
     */
    @RequestMapping(value="/ajaxAdd" , method=RequestMethod.POST )
    @ResponseBody
    public boolean addConcern(HttpServletResponse response , EzdUminden ezdUminden){
        boolean add = concernService.add(ezdUminden);
       return add;
    }

    /**
     * 删除一条数据
     * @param response
     * @param ezdUminden
     * @return
     */
    @RequestMapping(value="/ajaxDel" , method=RequestMethod.POST )
    @ResponseBody
    public boolean delConcern(HttpServletResponse response, EzdUminden ezdUminden){
        boolean del = concernService.del(ezdUminden);
        return del;
    }

}