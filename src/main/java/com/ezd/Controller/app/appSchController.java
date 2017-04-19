package com.ezd.Controller.app;

import com.ezd.model.EzdSchmg;
import com.ezd.service.EzdSchmgService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/19.
 */
@Controller
@RequestMapping("/appSchmg")
public class appSchController {

    @Resource
    private EzdSchmgService ezdSchmgService;

    //手机端返回 json 格式
    @GetMapping("/allSchmg")
    @ResponseBody
    private List<EzdSchmg> findAllSch(){

        List<EzdSchmg> ezdSchmgs = new ArrayList<EzdSchmg>();

        ezdSchmgs =  ezdSchmgService.findAll();

        return ezdSchmgs;
    }





}
