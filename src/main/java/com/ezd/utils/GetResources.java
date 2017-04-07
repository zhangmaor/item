package com.ezd.utils;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
/**
 * 读取Properties文件里的属性的方法
 *
 * */
public class GetResources {
    /**
     * 实现的具体方法
     * @param url ----Properties文件的路径，例如在resources文件夹内propertiesResoutces文件夹内的note.properties文件
     *            只需要传入："propertiesResoutces/note";
     *            再例如：在resources文件夹内的dataBase.properties文件
     *            只需要传入："dataBase"
     * @param attributes ----这个即是你要获取的Properties文件内的指定属性名；
     * @return ---返回的结果值是一个Properties文件内的属性值的map集合；
     */
    public Map<String, String> loads(String url, String ... attributes ){

        String ul = url+".properties";
        //("../../../../resources/dataBase.properties");
        InputStream is = GetResources.class.getClassLoader().getResourceAsStream(ul);
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
}
