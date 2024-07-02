package sol;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("돈 액수를 입력하세요");
        int money = sc.nextInt();
        int n50000 = money/50000; // 오만원권 개수
        money = money%50000;
        int n10000 = money/10000; // 만원권 개수
        money = money%10000;
        int n1000 = money/1000; //천원권 개수
        money = money%1000;
        int n500 = money/500;
        money = money%500;
        int n100 = money/100;
        money = money%100;
        int n10 = money/10;
        money = money%10; //1원 동전개수

        System.out.print("오만원 "+ n50000 + "개, ");
        System.out.print("만원 "+ n10000 + "개, ");
        System.out.print("천원 "+ n1000 + "개, ");
        System.out.print("오백원 "+ n500 + "개, ");
        System.out.print("백원 "+ n100 + "개, ");
        System.out.print("십원 "+ n10 + "개, ");
        System.out.print("1원 "+ money + "개 ");

        sc.close();







    }
}
