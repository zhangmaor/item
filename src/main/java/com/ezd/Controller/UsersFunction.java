package com.ezd.Controller;

import com.ezd.model.EzdUnews;
import com.ezd.service.EzdUnewsService;
import com.ezd.utils.AjaxUtil;
import org.json.simple.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.json.Json;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Administrator on 2017/4/11.
 */
@Controller
@RequestMapping("/user")
public class UsersFunction {
    @Resource
    private EzdUnewsService ezdUnewsService;


    @RequestMapping(value ="/ajaxUnews" ,method = RequestMethod.POST)
    public void getUnewsList(HttpServletResponse response,int umgId){
        List<EzdUnews> ezdUnewss = ezdUnewsService.displayUnews(umgId);
        String s = JSONArray.toJSONString(ezdUnewss);
        new AjaxUtil().renderData(response,s);
    }




}
