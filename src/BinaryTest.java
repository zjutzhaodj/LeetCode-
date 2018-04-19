/**
 * Created by Faker on 2018\4\19 0019.
 * email: 290707708@qq.com
 * blog: https://blog.csdn.net/qq_28709925
 */
public class BinaryTest {

    public static void main(String args[]){

        System.out.print(addByBinary(-420,4));
    }

    public static int addByBinary(int a,int b){
        if(b == 0){
            return a;
        }
        int xor = a^b;
        return addByBinary(xor,(a&b)<<1);
    }
}
