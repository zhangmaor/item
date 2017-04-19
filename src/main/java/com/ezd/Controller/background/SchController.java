package com.ezd.Controller.background;

import com.ezd.model.EzdSchmg;
import com.ezd.service.EzdSchmgService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    //PC 端 获取所有 学校信息
    @GetMapping
    private String  findScg(Model model){

        List<EzdSchmg> ezdSchmgs = new ArrayList<EzdSchmg>();
        ezdSchmgs =  ezdSchmgService.findAll();

        model.addAttribute("ezdSchmgs",ezdSchmgs);

        return "";
    }

    @RequestMapping("/addSchmg")
    private String  insertSchmg(EzdSchmg ezdSchmg){

       boolean res = ezdSchmgService.insertSchmg(ezdSchmg);

       if(res){
           return "";
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
