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

    public boolean hasAlternatingBits(int n) {

        String binary = Integer.toBinaryString(n);
        for(int i =0; i<binary.length()-1;i++){
            if(binary.charAt(i) == binary.charAt(i+1)){
                return false;
            }
        }
        return true;
    }


    public int[][] flipAndInvertImage(int[][] A) {
        int n = A[0].length;
        for(int[] res : A){
            for(int i =0;i<(n+1)/2;i++){
                int temp = res[i];
                res[i] = res[n-1-i]^1;
                res[n-1-i] = temp^1;
            }
        }
        return A;
    }

}
