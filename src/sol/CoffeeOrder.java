package sol;

import java.util.Scanner;

public class CoffeeOrder {
    public static void main(String[] args) {
        //scanner 생성
        Scanner scanner  = new Scanner(System.in);
        //텍스트 출력하고
        System.out.println("커피를 선택하세요 >>");
        //입력값 받아서 변수에 담고
        String coffee = scanner.nextLine();
        System.out.println("몇 잔 드릴까요? >>");
        int count = scanner.nextInt();

        // 값에 따라서 ???

        if(coffee.equals("에스프레소")) {
            System.out.println(2000* count + " 원 입니다.");
        }else if(coffee.equals("아메리카노")) {
            System.out.println(2500* count + " 원 입니다.");
        }else if(coffee.equals("카푸치노")) {
            System.out.println(3000* count + " 원 입니다.");
        }else if(coffee.equals("카페라떼")) {
            System.out.println(3500* count + " 원 입니다.");
        }else {
            System.out.println(coffee + " 는 없는 메뉴 입니다.");
        }
        //scanner 객체를 닫아준다.
        scanner.close();

    }
}
