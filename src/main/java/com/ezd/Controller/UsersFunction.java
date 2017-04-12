package com.ezd.Controller;

import com.ezd.model.EzdEnmg;
import com.ezd.model.EzdUminden;
import com.ezd.model.EzdUnews;
import com.ezd.service.ConcernService;
import com.ezd.service.EzdUnewsService;
import com.ezd.utils.AjaxUtil;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    /*获取当前用户下的全部的消息列表*/
    @RequestMapping(value = "/ajaxUnews", method = RequestMethod.POST)
    public void getUnewsList(HttpServletResponse response, int umgId) {
        List<EzdUnews> ezdUnewss = ezdUnewsService.displayUnews(umgId);
        String s = JSONArray.toJSONString(ezdUnewss);

        new AjaxUtil().renderData(response, s);
    }

    /*通过指定的消息编号获取该消息的详细信息*/


    @RequestMapping(value = "/ajaxGetOne", method = RequestMethod.POST)
    public void getUnews(HttpServletResponse response, int unewsId) {
        EzdUnews unews = ezdUnewsService.getUnews(unewsId);
        String s = JSONValue.toJSONString(unews);
        new AjaxUtil().renderData(response, s);
    }

    /*=======================关注================================*/

    /*显示我的关注里面的关注列表*/
    @RequestMapping(value = "/ajaxGetConcern", method = RequestMethod.POST)
    public void getConcern(HttpServletResponse response, int umgId) {
        List<EzdEnmg> enmgList = concernService.getEnmgList(umgId);
        String s = JSONArray.toJSONString(enmgList);
        new AjaxUtil().renderData(response, s);
    }

    /**
     * 点击一个企业列表显示该企业的详细信息
     * 或者在我的关注中点击一个企业显示也可以调用此方法
     * 或者在我的关注中点击一个企业显示也可以调用此方法
     */
    @RequestMapping(value = "/ajaxGetEnmg", method = RequestMethod.POST)
    public void getEnmg(HttpServletResponse response, int enmgId) {
        EzdEnmg enmg = concernService.getEnmg(enmgId);
        String s = JSONValue.toJSONString(enmg);
        new AjaxUtil().renderData(response, s);
    }

    /* 检查当前的用户是否关注该企业
     *返回值
     *    true ——  关注了；
     *   false —— 没关注；
     * */
    @RequestMapping(value = "/ajaxCheck", method = RequestMethod.POST)
    public void checkConcern(HttpServletResponse response, EzdUminden ezdUminden) {
        boolean check = concernService.check(ezdUminden);
        String s = JSONValue.toJSONString(check);
        new AjaxUtil().renderData(response, s);
    }

    @RequestMapping(value="/ajaxAdd" , method=RequestMethod.POST )
    public void addConcern(HttpServletResponse response , EzdUminden ezdUminden){
        boolean add = concernService.add(ezdUminden);
        String s = JSONValue.toJSONString(add);
        new AjaxUtil().renderData(response,s);
    }
    @RequestMapping(value="/ajaxDel" , method=RequestMethod.POST )
    public void delConcern(HttpServletResponse response, EzdUminden ezdUminden){
        boolean del = concernService.del(ezdUminden);
        String s = JSONValue.toJSONString(del);
        new AjaxUtil().renderData(response,s);
    }

}