package annotation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Faker on 2018\5\7 0007.
 * email: 290707708@qq.com
 * blog: https://blog.csdn.net/qq_28709925
 */
public class AnnotationTest {

    public static void main(String args[]){
        IpBean ipBean = new IpBean();
        int[] tcp = new int[]{80,8080};
        int[] udp = new int[]{443};
        ipBean.setTcpPort(tcp);
        ipBean.setUdpPort(udp);
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        ipBean.setMlist(list);
        List<String> list2 = new ArrayList<>();
        list2.add("4");
        list2.add("5");
        list2.add("6");
        String str = ipBean.getMlist().get(0);
        List<String> mlist = ipBean.getMlist();
        System.out.println(str);
        System.out.println(mlist);
//        ipBean.setMlist(list2);
//        System.out.println(str);
//        System.out.println(mlist);
        str = "5";
        mlist.add("7");
        System.out.println(ipBean.getMlist());
        System.out.println(ipBean.getMlist().get(0));

//        Class clazz = ipBean.getClass();
//        String ip = ipBean.getIp();
//        Field[] fields = clazz.getFields();
//        Field[] Dfields = clazz.getDeclaredFields();
//        for (Field fd : Dfields){
//            if(fd.isAnnotationPresent(Protocol.class)){
//                try {
//                    Field.setAccessible(Dfields,true);
//                    int[] port = (int[]) fd.get(ipBean);
//                    if(port!=null){
//                        for(int i:port){
//                            String out = "Connect: "+fd.getAnnotation(Protocol.class).value()+ip+":"+i;
//                            System.out.println(out);
//                        }
//                    }
//                    System.out.println(Arrays.toString(port));
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }
}
