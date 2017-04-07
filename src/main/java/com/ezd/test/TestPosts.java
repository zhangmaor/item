package com.ezd.test;

import com.ezd.utils.GetResources;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/5.
 */
public class TestPosts {
    public static void testPost(String phone, int sendType) throws IOException
    {
       // http://61.143.63.174:8080/Services.asmx
        String u ="http://61.143.63.174:8080/GateWay/Services.asmx/DirectSend" ;
        System.out.println("u="+u);
        URL url = new URL(u);
//        GetResources getResources = new GetResources();
//        Map<String,String> resourcesMap = getResources.loads("propertiesResoutces/note","userID","account","password");

        String userID = "690255";//账号
        String account = "888888"; //子账号
        String password = "abc888888"; //密码
        System.out.println("userID="+userID);
        System.out.println("account="+account);
        System.out.println("password="+password);
        String content = "你当前注册账号的密码为1258，如非本人操作请忽略此短信！【e职多平台】";//发送的内容
       // String phone = "13620463438";//发送到的手机号
       // int sendType = 1;//发送类型
        String sendTime = "";//发送时间
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");

      //  "UserID=803369&Account= admin&Password=123123&Content=您的注册验证码为8268，该验证码10分钟内有效。如非本人操作请忽略此短信！【风信通软件】&Phones=15912341234& SendType=1&SendTime=&PostFixNumber=";

        String urlString = "UserID="+userID+"&Account="+account+"&Password="+password+"&Content="+content+"&Phones="+phone+"&SendType="+sendType+"&SendTime=&PostFixNumber=";
         System.out.println(urlString);
        urlString = urlString.replace("%","％");
        urlString = urlString.replace("+","＋");
        urlString = urlString.replace(" ","+");

        out.write(urlString);
        out.flush();
        out.close();

        String sCurrentLine;
        String sTotalString;
        sCurrentLine = "";
        sTotalString = "";
        InputStream l_urlStream;
        l_urlStream = connection.getInputStream();

        BufferedReader l_reader = new BufferedReader(new InputStreamReader(l_urlStream));
        while ((sCurrentLine = l_reader.readLine()) != null)
        {
            sTotalString += sCurrentLine + "\r\n";
        }
        System.out.println(sTotalString);
    }
    public static void main(String[] args) throws IOException
    {
        testPost("13680399658",1);
    }
}
