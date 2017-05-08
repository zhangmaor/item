
package com.ezd.controller.app;

import com.ezd.jackonInterface.*;
import com.ezd.model.*;
import com.ezd.service.EzdBigretService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * Created by Administrator on 2017/4/17.
 * 大招会的app相关的
 */
@Controller
@RequestMapping("/bigret")
public class BigretController {
    @Resource
    private EzdBigretService ezdBigretService;

    /**
     * 显示一个详细信息
     * @param response
     * @param id
     */
    @RequestMapping(value = "/ajaxBigret", method = RequestMethod.POST)
    @ResponseBody
    public EzdBigret get(HttpServletResponse response, int id){
        EzdBigret ezdBigret = ezdBigretService.get(id);
        return ezdBigret;
    }
    /*
        bigret/ajaxBigretList
    * */
    @RequestMapping(value = "/ajaxBigretList", method = RequestMethod.GET)
    public void statusGet(int status,HttpServletResponse response){
        List<EzdBigret> bigretList = ezdBigretService.modeGet(status);
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixInAnnotations(EzdBigret.class, BigretFilterGetAll.class);
        mapper.addMixInAnnotations(EzdEnmg.class, BigretEnmgFilter.class);
        mapper.addMixInAnnotations(EzdErlbigret.class, BigretErlbigretFilter.class);
        mapper.addMixInAnnotations(EzdUmg.class, BigretUmgFilter.class);
        OutputStream outputStream = null;
        try {
            outputStream =  response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mapper.writeValue(outputStream,bigretList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 点击某个学校
     * 然后就进入到该学校的大招会列表
     * @param id
     */
    @RequestMapping("/schoolebigret")
    @ResponseBody
    public List<EzdBigret> getschoolBigret(int id){
        List<EzdBigret> bigretList = ezdBigretService.addressGet(id);
        return bigretList;
    }
}


