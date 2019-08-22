package xiaohutu;

import java.util.ArrayList;
import java.util.List;

public class TestJava {
    public static void main(String[] args) {
        String[] s1 = new String[0];
        System.out.println(s1.length);
        for (String s : s1) {
            System.out.println("s:" + s);
        }
        String[] strings2 = {"a"};
        System.out.println(strings2.length);

        /*List<String> list1 = null;
        String[] strings4 = list1.toArray(new String[0]);
        System.out.println("strings4:" + strings4.length);*/

        List<String> list = new ArrayList<>();
        System.out.println("list:" + list.size());
        String[] strings3 = list.toArray(new String[0]);
        System.out.println(strings3.length);
        list.add("a");
        list.add("b");
        String[] strings = list.toArray(new String[0]);
        System.out.println(strings.length);

        String[] strings1 = list.toArray(new String[list.size()]);
        System.out.println(strings1.length);
    }
}
