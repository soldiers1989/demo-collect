package com.sun.eth.network;

import org.apache.commons.net.telnet.TelnetClient;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/**
 * @author Jungle
 * @create 2018-03-22 11:46
 */
public class MainTest {

    ExecutorService executorService = null;

    public static void main(String[] args){
        try {
            ArrayList<String> ipList = new ArrayList();
            ipList.add("141.101.144.54,c-24-1-191-217.hsd1.il.comcast.net,125.212.245.160,static.208.219.76.144.clients.your-server.de,45.76.195.228,109.91.36.247,34.195.128.99,88.88.107.96,119.23.136.252,93.85.92.250,35.154.153.81,72.203.246.146,113.87.182.170,109.228.137.248,wsip-24-252-174-193.ph.ph.cox.net,47.91.215.209,70.69.222.215,37.228.225.170,82.1.231.23,23.104.199.104.bc.googleusercontent.com,183.14.29.196,190.196.217.202,31.15.189.179,207.148.6.18,94.242.204.62,106.222.43.217,183.180.106.144,91.89.219.222,164.132.121.49,83.82.2.66,52.59.208.29,104.236.17.88,host-92-27-240-183.static.as13285.net,24-205-87-236.dhcp.psdn.ca.charter.com,75-128-116-147.dhcp.aldl.mi.charter.com,103.218.156.70,82.33.32.111,c-73-228-40-139.hsd1.nm.comcast.net,94.177.234.155,ec2-54-227-154-53.compute-1.amazonaws.com,ec2-18-221-243-87.us-east-2.compute.amazonaws.com,ip68-225-227-66.oc.oc.cox.net,ppp109-252-60-67.pppoe.spdop.ru,113.92.37.102,167.99.88.111,210.185.94.234,cm-84.210.216.129.getinternet.no,118.26.73.2,52.86.160.255,139.59.182.130,23.24.168.98,c-73-93-31-28.hsd1.ca.comcast.net,71.218.127.72,118.178.254.20,13.125.233.32,ec2-35-158-237-80.eu-central-1.compute.amazonaws.com,118.123.245.171,13.126.60.110,27.223.78.169,52.169.223.56,104.174.61.2,169-1-76-233.ip.afrihost.co.za,46.5.0.184,24.78.55.58,89.25.22.146,52.198.179.75,dhcp-206-141-234-192.attalascom.net,193.140.197.66,88.b3.2ea9.ip4.static.sl-reverse.com,101.132.146.177,217.182.94.113,mobile-166-173-248-75.mycingular.net,ec2-54-236-174-31.compute-1.amazonaws.com,ec2-34-243-110-5.eu-west-1.compute.amazonaws.com,91.127.132.89,54.91.212.136,90.154.68.138,47.52.254.89,37.17.43.12,115.236.9.82,mail.creepto.net,35.176.207.236,115.233.221.211,133.94.227.35.bc.googleusercontent.com,124.65.120.198,ec2-18-218-141-217.us-east-2.compute.amazonaws.com,li648-220.members.linode.com,123.120.87.146,cgn93.mobile.post.lu,109.74.145.30,184.103.96.154,35.176.207.236,34.227.172.43,35.153.106.172,13.125.97.68,cpe-67-244-30-95.nyc.res.rr.com,188-230-251-155.dynamic.t-2.net,ethereum.amb1ent.org,ec2-13-115-231-126.ap-northeast-1.compute.amazonaws.com,75.166.64.42");

            for(int i = 0 ; i< ipList.size(); i++){
                String ipsStr = ipList.get(i);
                String[] ipArrys = ipsStr.split(",");
                for(String ip : ipArrys){
                    ping(ip);
                }
            }
            //ping("192.168.9.160");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ping(String ip) throws Exception{
        // 1、先ping通
        // 2、查找其所有开放端口
        try {
            InetAddress.getByName(ip).isReachable(2000);
        } catch (UnknownHostException e) {
            System.out.println("未知主机地址.");
            return;
        } catch (IOException e) {
            System.out.println("IP不通，连接失败");
            return;
        }
        System.out.println("IP:" + ip +" 可以访问.");
        final String tmpIp = ip;
        ArrayList<Integer> ports = new ArrayList<Integer>();
        // 1024到65535
        for (int i = 1024; i < 65535; i++){
            final int tmpPort = i;
            TaskExecutor.instance.submitWorkItem(new Callable() {
                public Object call() throws Exception {
                    TelnetClient telnet = new TelnetClient();
                    try{
                        telnet.connect(tmpIp, tmpPort);
                    }catch (SocketException e){
                        //System.out.println(msgtext);
                        //System.out.println("....." + tmpPort);
                        return null;
                    }catch (IOException e) {
                        //System.out.println(msgtext);
                        return null;
                    }
                    try{
                        telnet.disconnect();
                        System.out.println("["+tmpIp+":"+tmpPort+"] 开启了端口..");
                    }
                    catch (IOException e){
                    }
                    return null;
                }
            });
        }
        //System.out.println("---end...");
    }
}
