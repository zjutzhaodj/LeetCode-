/**
 * Created by Faker on 2018\4\16 0016.
 * email: 290707708@qq.com
 * blog: https://blog.csdn.net/qq_28709925
 */
public class ReverseTest {

    public static void main(String args[]){

        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {

        if (null == s) {
            return null;
        }
        StringBuilder builder = new StringBuilder();
        String[] src = s.split(" ");
        for (String str : src) {
            StringBuilder temp = new StringBuilder(str);
            builder.append(temp.reverse() + " ");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }
}
