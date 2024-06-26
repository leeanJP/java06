package chap04;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        // 기본 형식

//        do{
//            일단하고본다
//        }while (조건식) {
//            조건이 true 면 동작
//        }

        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 q를 입력하세요");

        Scanner sc = new Scanner(System.in);
        String inputString;

        do {
            System.out.println(" > ");
            inputString = sc.nextLine();
            System.out.println(inputString);
        }while (!inputString.equals("q"));


        System.out.println("프로그램 종료");



    }
}
