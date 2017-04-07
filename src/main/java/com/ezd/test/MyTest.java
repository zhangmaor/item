package com.ezd.test;

import com.ezd.utils.GetResources;
import com.ezd.utils.Sendsms;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * Created by Administrator on 2017/4/5.
 */
public class MyTest {
    public Map<String, String> loads(String url,String ... attributes ){

        String ul = url+".properties";
        //("../../../../resources/dataBase.properties");
        InputStream is = MyTest.class.getClassLoader().getResourceAsStream(ul);
        Properties dbProps = new Properties();
        Map<String,String> map = new HashMap<String,String>();
        try {
            dbProps.load(is);
            for (String attribute: attributes
                    ) {
                map.put(attribute,dbProps.getProperty(attribute)) ;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.err.println("不能读取属性文件. " +
                    "请确保db.properties在CLASSPATH指定的路径中");
        }
        return map;
    }



    public static void main(String[] args) throws IOException {
        Sendsms sendsms = new Sendsms();
       int a = sendsms.getnote("13620463438");
        System.out.print("a="+a);

    }
}
