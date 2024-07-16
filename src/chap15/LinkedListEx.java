package chap15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        //ArrayList 객체 생성
        List<String> arrList = new ArrayList<>();

        //LinkedList 객체 생성
        List<String> linkList = new LinkedList<>();

        //시작 시간과 종료시간을 저장할 변수 선언
        long startTime;
        long endTime;

        //ArrayList 컬렉션에 저장하는 시간을 측정
        startTime = System.nanoTime();

        for(int i=0; i<10000; i++){
            arrList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("Array 소요 시간 : " + (endTime - startTime));

        //LinkedList 컬렉션에 저장하는 시간을 측정
        startTime = System.nanoTime();
        for(int i=0; i<10000; i++){
            linkList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 소요 시간 : " + (endTime - startTime));





    }
}
