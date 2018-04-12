import java.util.*;

/**
 * Created by Faker on 2018\4\11 0011.
 * email: 290707708@qq.com
 * blog: https://blog.csdn.net/qq_28709925
 */
public class KeyboardRowTest {


    public static void main(String[] args) throws Exception {
        String[] test = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(test)));
        System.out.println("----------------------------");
        System.out.println(Arrays.toString(findWords2(test)));

    }

    public static String[] findWords(String[] words) {
        String top = "qwertyuiop";
        String mid = "asdfghjkl";
        String bottom = "zxcvbnm";
        List<String> out = new ArrayList<>();
        String[] strs = new String[]{top, mid, bottom};
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            for (char a : strs[i].toCharArray()) {
                map.put(a, i);
            }
        }

        for (String str : words) {
            int index = map.get(str.toLowerCase().charAt(0));
            boolean hasMatch = true;
            for (char a : str.toLowerCase().toCharArray()) {
                if (index == map.get(a)) {
                    continue;
                } else {
                    hasMatch = false;
                }
            }
            if (hasMatch) {
                out.add(str);
            }
        }
        return out.toArray(new String[0]);

    }


    public static String[] findWords2(String[] words) {
        String top = "qwertyuiop";
        String mid = "asdfghjkl";
        String bottom = "zxcvbnm";
        List<String> out = new ArrayList<>();

        for (String str : words) {
            int one = 0;
            int two = 0;
            int three = 0;
            for (char a : str.toLowerCase().toCharArray()) {
                String ss = String.valueOf(a);
                if (top.contains(ss)) {
                    one = 1;
                } else if (mid.contains(ss)) {
                    two = 1;
                } else if (bottom.contains(ss)) {
                    three = 1;
                }
            }
            if (one + two + three == 1) {
                out.add(str);
            }
        }
        return out.toArray(new String[0]);
    }


}
