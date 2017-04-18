package com.ezd.utils;

import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Created by Administrator on 2017/4/13.
 * 类型的区分
 * 用户（头像，临时图片）---- 头像是  1(userImg) ; 身份证 0 ---userTmp;
 * 企业 ----- 2 (enmg)
 * 学校 ----- 3  (schoolImg)
 * 文章 ----- 4  (articleImg)
 */
public class Upload {
    /**
     * 是本类的内部使用的一个方法
     * 通过传递过了类型
     * 来返回文件夹的名称
     * @param i ------ 传递过来的类型（详情从11行开始看）
     * @return  ------ 返回具体的类型名称
     */
    private String selectUrl(int i){
        String url = null;
        if(i==0){
            url = "userTmp";
        }else if(i==1){
            url = "userImg";
        }else if(i==2){
            url =  "enmg";
        }else if(i==3){
            url = "schoolImg";
        }else if(i==4){
            url = "articleImg";
        }
        return url;
    }

    /**
     * 实现上传图片到指定的文件夹之下
     * @param userName  -------  如果是用户的话就是传递手机号，否则（企业，学校，文章）之类的话就传递 该id
     *                             该参数是用来作为图片的名称的！！
     * @param file      --------  这个暂时不管
     * @param request   --------
     * @param modelMap
     * @param type      ---------  用户的类型（用户，企业，学校，文章）
     *                              分别用0,1,2,3,4来区分，
     *                              详情见本类的第11行；
     * @return           ---------- 返回的字符串是图片的一个根目录下的完整路径
     * @throws Exception
     */
    public String fildUpload(String userName , MultipartFile file,
                              HttpServletRequest request , ModelMap modelMap,int type)throws Exception{

        //获得物理路径webapp所在路径
        String pathRoot = request.getServletContext().getRealPath("/");
        String path = "";
        String url = "";//图片的目录
        String  catalog = this.selectUrl(type);//文件夹目录名
        if(!file.isEmpty()){

            // String contentType=file.getContentType();
            String originalFilename = file.getOriginalFilename();
            String suffix = originalFilename.substring(originalFilename.lastIndexOf("."),originalFilename.length());

            System.out.println("suffix="+suffix);
            System.out.println("originalFilename="+originalFilename);
            //获得文件后缀名称
            //String imageName=contentType.substring(contentType.indexOf("/")+1);
            // System.out.println("imageName="+imageName);
            //path ="/static/images/"+"."+imageName;
            path = "/static/"+catalog;

            File file1 = new File(pathRoot + path);

            if(!file1.exists()){
                boolean b =file1.mkdirs();
                System.out.println("b="+b);
                System.out.println("创建是否成功！！！");
            }
            url = path + "/"+userName+ suffix;

            File file2 = new File(pathRoot + url);
            if(file2.exists()){
                file2.delete();
            }
            file2.createNewFile();
            file.transferTo(file2);
        }
       // modelMap.addAttribute("imagesPath",url);
        return url;
    }
}
