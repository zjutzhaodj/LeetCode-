/**
 * Created by Faker on 2018\4\16 0016.
 * email: 290707708@qq.com
 * blog: https://blog.csdn.net/qq_28709925
 */
public class HamingTest {

    public static void main(String args[]) {
        System.out.print(getHaming(15,0));
    }

    public static int getHaming(int a, int b) {
        int res = a ^ b;
        int count = 0;
        while (res !=0){
            if((res&1) == 1){
                count++;
            }
            res = res>>1;
        }
        return count;
    }
}
