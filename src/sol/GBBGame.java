package sol;

import java.util.Scanner;

public class GBBGame {
    public static void main(String[] args) {
        String[] com = {"가위", "바위", "보"};

        Scanner sc = new Scanner(System.in);
        System.out.println("컴퓨터와 가위바위보 게임을 시작 합니다!");

        while (true){
            System.out.println("가위 바위 보! >>");
            String a = sc.nextLine();
            if(a.equals("그만")){
                System.out.println("게임을 종료합니다.");
                break; //while문 종료
            }
            //컴퓨터의 가위바위보 값을 랜덤하게 결정
            int n = (int)(Math.random() *3);  // 0 1 2
            String comChoice = com[n];
            System.out.println("사용자 : " + a + " , 컴퓨터 : " + comChoice);

            if(a.equals("가위")){
                if(comChoice.equals("가위")){
                    System.out.println("비겼습니다.");
                }else if(comChoice.equals("바위")){
                    System.out.println("컴 win");
                }else {
                    System.out.println("유저 Win");
                }
            }else if(a.equals("바위")) {
                if(comChoice.equals("바위")){
                    System.out.println("비겼습니다.");
                }else if(comChoice.equals("보")){
                    System.out.println("컴 win");
                }else {
                    System.out.println("유저 Win");
                }
            }else if(a.equals("보")){
                if(comChoice.equals("보")){
                    System.out.println("비겼습니다.");
                }else if(comChoice.equals("가위")){
                    System.out.println("컴 win");
                }else {
                    System.out.println("유저 Win");
                }
            }else{
                System.out.println("다시 입력하세요");
            }
        }
        sc.close();
    }
}
