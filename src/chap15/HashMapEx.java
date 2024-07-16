package chap15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        //Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

        //객체 저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        System.out.println("총 Entry 수 : " + map.size());
        System.out.println("============");

        //키로 값 얻기
        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key + " : " + value);
        System.out.println("=============");

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        System.out.println("키 반복자로 반복");
        while (keyIterator.hasNext()){
            String k = keyIterator.next();
            Integer v = map.get(k);

            System.out.println(k + " : " + v);
        }
        System.out.println("============");

        //엔트리 set 컬렉션을 가지고 반복해서 키 , 값 가져오기

        Set<Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        System.out.println("엔트리 반복자로 반복");
        while (entryIterator.hasNext()){
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }





    }

}
