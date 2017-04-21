package com.ezd.controller.app;

import com.ezd.model.EzdBigret;
import com.ezd.model.EzdSchmg;
import com.ezd.service.EzdBigretService;
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
    @Resource
    private EzdBigretService ezdBigretService;

    //手机端返回 json 格式
    @GetMapping("/allSchmg")
    @ResponseBody
    private List<EzdSchmg> findAllSch(){

        List<EzdSchmg> ezdSchmgs = new ArrayList<EzdSchmg>();

        ezdSchmgs =  ezdSchmgService.findAll();

        return ezdSchmgs;
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
