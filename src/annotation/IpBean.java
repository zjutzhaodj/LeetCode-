package annotation;

import java.util.List;

/**
 * Created by Faker on 2018\5\7 0007.
 * email: 290707708@qq.com
 * blog: https://blog.csdn.net/qq_28709925
 */
public class IpBean {

    @Protocol("udp://")
    private int[] udpPort;
    @Protocol("Tcp://")
    private int[] tcpPort;

    private List<String> mlist;

    private String ip;

    public int[] getUdpPort() {
        return udpPort;
    }

    public List<String> getMlist() {
        return mlist;
    }

    public void setMlist(List<String> mlist) {
        this.mlist = mlist;
    }

    public void setUdpPort(int[] udpPort) {
        this.udpPort = udpPort;
    }

    public int[] getTcpPort() {
        return tcpPort;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setTcpPort(int[] tcpPort) {
        this.tcpPort = tcpPort;
    }
}
