package chap16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaEx3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        list.forEach(element -> System.out.println(element));

        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));

        //출력
        list.forEach(element -> System.out.println(element));


    }
}
