package chap15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        //HashSet 객체 생성
        Set<String> set = new HashSet<>();

        //객체 저장
        set.add("JAVA");
        set.add("Spring");
        set.add("JAVA");
        set.add("JSP");

        //저장된 객체 수 출력
        int size = set.size();
        System.out.println("총 객체 수 : " + size);

        //객체 가져오기 1 반복문
        for(String s : set){
            System.out.println("반복문 사용 : " + s);
        }
        //객체 가져오기 2 Iterator
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){
            //객체 가져오기
            String s = iterator.next();
            System.out.println(s);

            if(s.equals("JSP")){
                //가져온 객체를 컬렉션에서 제거
                iterator.remove();
            }
        }
        System.out.println("========");
        set.remove("JAVA");
        for(String s : set){
            System.out.println(s);
        }


    }
}
