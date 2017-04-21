package com.ezd.controller;

import com.ezd.model.EzdErlenret;
import com.ezd.service.EzdErlenretService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/21.
 */
@Controller
@RequestMapping("/EzdErlenret")
public class EzdErlenretController {

    @Resource
    private EzdErlenretService ezdErlenretService;


    /**
     * 根据招聘信息查出报名的人
     * @return
     */
    @RequestMapping(value = "/ajaxGetAll",method = RequestMethod.GET)
    @ResponseBody
    public List<EzdErlenret> getAll(){
        List<EzdErlenret> list = new ArrayList<>();
        list = ezdErlenretService.getAll();
        return list;
    }

}
