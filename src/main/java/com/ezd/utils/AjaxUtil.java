package com.ezd.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017/4/11.
 */
public class AjaxUtil {
    /**
     * ajax的一个方法
     * 用于写入字符串到response
     * @param response
     * @param url
     */
    public void renderData(HttpServletResponse response, String url) {
        PrintWriter printWriter = null;
        try {
            printWriter = response.getWriter();
            printWriter.print(url);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (printWriter != null) {
                printWriter.flush();
                printWriter.close();
            }
        }
    }
}
