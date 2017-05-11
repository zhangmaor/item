package com.ezd.controller.app;

import com.ezd.jackonInterface.BigretEnmgFilter;
import com.ezd.jackonInterface.EnmgEnretFilter;
import com.ezd.model.EzdBigret;
import com.ezd.model.EzdEnmg;
import com.ezd.model.EzdEnret;
import com.ezd.service.EzdEnmgService;
import com.ezd.service.EzdEnretService;
import com.ezd.utils.LocalhostIp;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * Created by Administrator on 2017/4/24.
 * app_企业
 */
@Controller
@RequestMapping("/app_enmg")
public class AppEnmg {
    @Resource
    private EzdEnmgService ezdEnmgService;

    /**
     * 显示全部的企业列表/app_enmg/getEnmgAll
     * @return
     */
    @RequestMapping("/getEnmgAll")

    public void getList(HttpServletResponse response){
        List<EzdEnmg> all = ezdEnmgService.getAll();
        String ip = new LocalhostIp().getIp();
        for (EzdEnmg e: all                ) {
            //e.getBigretLogo();
            e.setEnmgLogo(ip+e.getEnmgLogo());
        }
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixIn(EzdEnmg.class, BigretEnmgFilter.class);
        mapper.addMixIn(EzdEnret.class, EnmgEnretFilter.class);
        OutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mapper.writeValue(outputStream,all);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 通过区域来查询企业信息
     * @param address  城市名
     * @return
     */
    @RequestMapping("/addressGet")
    @ResponseBody
    public List<EzdEnmg> getEnmgList(String address){
        List<EzdEnmg> enmgList = ezdEnmgService.addressGet(address);
        String ip = new LocalhostIp().getIp();
        for (EzdEnmg e: enmgList                ) {
            //e.getBigretLogo();
            e.setEnmgLogo(ip+e.getEnmgLogo());
        }
        return enmgList;
    }

    /**
     * 通过企业的类型来进行查询
     * @param typeId
     * @return
     */
    @RequestMapping("/typeGet")
    @ResponseBody
    public List<EzdEnmg> getEnmgList(int typeId){
        List<EzdEnmg> enmgList = ezdEnmgService.typeGet(typeId);
        String ip = new LocalhostIp().getIp();
        for (EzdEnmg e: enmgList                ) {
            //e.getBigretLogo();
            e.setEnmgLogo(ip+e.getEnmgLogo());
        }
        return enmgList;
    }

    /**
     * 根据行业类型进行查询！！！
     * @param industryId
     * @return
     */
    @RequestMapping("/industryGet")
    @ResponseBody
    public List<EzdEnmg> enmgList(int industryId){
        List<EzdEnmg> enmgList = ezdEnmgService.industryGet(industryId);
        String ip = new LocalhostIp().getIp();
        for (EzdEnmg e: enmgList                ) {
            //e.getBigretLogo();
            e.setEnmgLogo(ip+e.getEnmgLogo());
        }
        return enmgList;
    }
}
