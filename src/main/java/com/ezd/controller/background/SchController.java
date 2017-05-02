package com.ezd.controller.background;

import com.ezd.model.EzdSchmg;
import com.ezd.model.EzdSchtype;
import com.ezd.service.EzdSchTypeService;
import com.ezd.service.EzdSchmgService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Creministrator on 2017/4/19.
 * 学校处理模块
 */
@Controller
@RequestMapping("/bgSchmg")
public class SchController {

    @Resource
    private EzdSchmgService ezdSchmgService;
    @Resource
    private EzdSchTypeService ezdSchTypeService;



    // 获取所有 学校信息
    @GetMapping
    private String  findScg(Model model){

        List<EzdSchmg> ezdSchmgs = new ArrayList<EzdSchmg>();
        List<EzdSchtype> ezdSchtypes = new ArrayList<EzdSchtype>();

        ezdSchmgs =  ezdSchmgService.findAll();

        ezdSchtypes = ezdSchTypeService.findSchType();

        model.addAttribute("shmgs",ezdSchmgs);
        model.addAttribute("types",ezdSchtypes);

        return "xxgl";
    }

    //根据条件查询学校信息bgSchmg
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ResponseBody
    private List<EzdSchmg> search(String name, int cengci){

        System.out.println("name ="+ name + "type="+ cengci );

        EzdSchmg ezdSchmg = new EzdSchmg();
        ezdSchmg.setSchmgName(name);

        ezdSchmg.setTypeId(cengci);

        System.out.println("name ===" + ezdSchmg.getSchmgName());

        List<EzdSchmg> ezdSchmgs = ezdSchmgService.findSchmg(ezdSchmg);

        for(EzdSchmg s :ezdSchmgs ){
            System.out.println(s.getSchmgName()+"======="+s.getEzdBigrets().size());

            System.out.println("ezdshcmg==="+s);
        }

        return ezdSchmgs;
    }

    @RequestMapping("/addSchmg")
    private String  insertSchmg(EzdSchmg ezdSchmg){

       boolean res = ezdSchmgService.insertSchmg(ezdSchmg);

       if(res){
           return "redirect:/bgSchmg";
       }

        return "";
    }

    @RequestMapping("/updateSchmg")
    private String  updateSchmg(EzdSchmg ezdSchmg){

        boolean res = ezdSchmgService.updateSchmg(ezdSchmg);

        if(res){
            return "";
        }

        return "";
    }


}
