import java.util.ArrayList;
import java.util.List;

/**
 * Created by Faker on 2018\4\13 0013.
 * email: 290707708@qq.com
 * blog: https://blog.csdn.net/qq_28709925
 */
public class SelfDividingTest {

    public static void main(String args[]) {

        System.out.print(selfDividingNumbers(1,22));
    }


    public static boolean check(int a) {
        int temp = a;
        while (temp != 0) {
            int x = temp % 10;
            if (x == 0 || a % x != 0) {
                return false;
            }
            temp = temp / 10;
        }
        return true;
    }


    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left;i<=right;i++){
            if(check(i)){
                list.add(i);
            }
        }
        return list;
    }
}
