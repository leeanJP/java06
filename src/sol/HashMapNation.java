package sol;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapNation {
    public static void main(String[] args) {
        HashMap<String, Integer> nations = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.println("나라 이름과 인구를 5개 입력하시세요.(예: Korea 5000)");
        for(int i=0; i<5; i++){
            System.out.println("나라 이름 ,인구 >> ");
            String nation = sc.next();
            int population = sc.nextInt();
            nations.put(nation, population);
        }

        int bigPop = 0; //제일 많은 인구
        String bigNation = "";  //제일 인구가 많은 나라
        Set<String> names = nations.keySet();
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            String name = it.next();
            int n = nations.get(name);

            if(bigPop < n){
                bigPop = n;
                bigNation = name;
            }
        }
        System.out.println("제일 인구가 많은 나라는 (" + bigNation + " , " + bigPop + ")");
        sc.close();
    }
}
