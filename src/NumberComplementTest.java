/**
 * Created by Faker on 2018\4\12 0012.
 * email: 290707708@qq.com
 * blog: https://blog.csdn.net/qq_28709925
 */
public class NumberComplementTest {


    public static void main(String[] args){

        System.out.println(getComplement(5));

        System.out.println(getComplement(7));

        System.out.println(getComplement(10));

        compare(5,4);

        compare(15,4);

        compare(3,8);
        //        System.out.println(Integer.toBinaryString(5));
//        System.out.println(Integer.toBinaryString(-5));
//        System.out.println(Integer.toBinaryString(7));
//        System.out.println(Integer.toBinaryString(-7));
//        System.out.println(Integer.toBinaryString(15));
//        System.out.println(Integer.toBinaryString(-15));
//        System.out.println(Integer.toBinaryString(36));
//        System.out.println(Integer.toBinaryString(-36));
//        System.out.println(Integer.toBinaryString(6));
//        System.out.println(Integer.toBinaryString(-6));
//        System.out.println(Integer.toBinaryString(7));
//        System.out.println(Integer.toBinaryString(~7).length());
//        System.out.println(Integer.toBinaryString((int) (Math.pow(2,32)-1)));

    }


    public static int Add(int a, int b){
        //先取2数的异或，计算不进位的和
        int sum = a^b;
        //取2数的与，看是否有进位
        int carry = a&b;
        //如果 与的结果不为0，说明有进位。进位左移一位就是只考虑进位的结果，跟上一步的不考虑进位的结果进行递归
        if(carry == 0){
            return sum;
        }else {
            return Add(sum,(carry<<1));
        }
    }


    public static int getComplement(int a){
        int i = 0;
        int j = 0;
        while (i<a){
            i += 1<<j;
            j++;
        }
        return i &(~a);
    }


    public static void compare(int a, int b){
        int res1 = a-b;
        int res2 = a & (~b);
        System.out.println("res1: "+res1 +" res2: "+res2);
    }
}
