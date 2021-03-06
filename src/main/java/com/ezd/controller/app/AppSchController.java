package com.ezd.controller.app;

import com.ezd.model.EzdBigret;
import com.ezd.model.EzdSchmg;
import com.ezd.service.EzdBigretService;
import com.ezd.service.EzdSchmgService;
import com.ezd.utils.LocalhostIp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/19.
 */
@Controller
@RequestMapping("/appSchmg")
public class AppSchController {

    @Resource
    private EzdSchmgService ezdSchmgService;
    @Resource
    private EzdBigretService ezdBigretService;



    //手机端返回 json 格式

    /**
     * 全部的学校信息
     * @return
     */
    @GetMapping("/allSchmg")
    @ResponseBody
    private List<EzdSchmg> findAllSch(){

        List<EzdSchmg> ezdSchmgs = new ArrayList<EzdSchmg>();

       /* List<EzdBigret> ezdBigrets = ezdBigretService.addressGet(42);
        return ezdBigrets;*/
        ezdSchmgs =  ezdSchmgService.findAll();
        String ip = new LocalhostIp().getIp();
        for (EzdSchmg e: ezdSchmgs
             ) {
            e.setSchmgLogo(ip+e.getSchmgLogo());
        }
        return ezdSchmgs;
}



    /**
     * 点击某个学校
     * 然后就进入到该学校的大招会列表
     * @param id 学校的ID
     */
    @RequestMapping(value = "/schoolebigret",method = RequestMethod.POST)
    @ResponseBody
    public List<EzdBigret> getschoolBigret(int id){
        List<EzdBigret> bigretList = ezdBigretService.addressGet(id);
        String ip = new LocalhostIp().getIp();
        for (EzdBigret e: bigretList
                ) {
            e.setBigretLogo(ip+e.getBigretLogo());
        }
        return bigretList;
    }

    @RequestMapping(value = "/schoolebigret",method = RequestMethod.GET)
    @ResponseBody
    public List<EzdBigret> postschoolBigret(int id){
        List<EzdBigret> bigretList = ezdBigretService.addressGet(id);
        String ip = new LocalhostIp().getIp();
        for (EzdBigret e: bigretList
                ) {
            e.setBigretLogo(ip+e.getBigretLogo());
        }
        return bigretList;
    }

}
