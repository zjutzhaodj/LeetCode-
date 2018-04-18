import java.util.Arrays;

/**
 * Created by Faker on 2018\4\18 0018.
 * email: 290707708@qq.com
 * blog: https://blog.csdn.net/qq_28709925
 */
public class ArrayPartitionTest {

    public static void main(String args[]){

        int a[] =new int[]{7,3,1,0,0,6};
        System.out.print(arrayPairSum(a));
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0;i<nums.length;i=i+2){
            sum+=nums[i];
        }
        return sum;
    }
}
