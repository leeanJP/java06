package sol;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //StringTokenizer
        //자바에서 특정 구분자를 기준으로 분리하는데 사용하는 클래스
        try(Scanner sc1 = new Scanner(System.in)){
            while (true){
                String s = sc.nextLine();
                if(s.equals("exit")){
                    System.out.println("종료합니다.");
                    break;
                }
                // I Love Java
                StringTokenizer st = new StringTokenizer(s, " ");
                System.out.println("어절 개수는 : "  + st.countTokens());
            }
        }catch (Exception e ){

        }




    }
}
