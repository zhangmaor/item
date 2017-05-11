package com.ezd.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Administrator on 2017/5/2.
 */
public class LocalhostIp {
    public String getIp(){
        InetAddress localHost =null;
        try {
             localHost = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        //System.out.println("本地IP地址是【="+localHost);
        String ip = localHost.getHostAddress();
        String getlocalhostIp = ip+":8080";
        return getlocalhostIp;
    }

    public static void main(String[] args) {
        LocalhostIp localhostIp = new LocalhostIp();
        localhostIp.getIp();
    }
}
