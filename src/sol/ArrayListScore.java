package sol;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListScore {
    public static void main(String[] args) {
        ArrayList<Character> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("빈 칸으로 분리하여 5개의 학점을 입력(A/B/C/D/F) >>");
        //반복문으로 하나씩 잘라서 ArrayList a 에다가 넣기
        for(int i = 0; i < 5; i++) {
            String s = sc.next();
            if(s.length() > 1){
                System.out.println("문자가 아닙니다.");
                sc.close();
                return;
            }
            char ch = s.charAt(0);
            if(ch >= 'A' && ch <='D' || ch =='F'){
                a.add(ch);
            }else {
                System.out.println("학점이 올바르지 않습니다.");
                sc.close();
                return;
            }
        }
        //ArrayList 반복하면서 각 학점에 점수 반환하기
        sc.close();

        double score = 0.0;
        for(int i=0; i<a.size();  i++){
            char ch = a.get(i);
            switch (ch){
                case 'A': score = 4.0; break;
                case 'B': score = 3.0; break;
                case 'C': score = 2.0; break;
                case 'D': score = 1.0; break;
                case 'F': score = 0.0; break;
            }
        System.out.print(score + " ");
        }


    }
}
