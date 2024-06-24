package chap02;


import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        //Java 입력된 데이터를 읽고 변수에 저장할 때 사용하는 Scanner

        Scanner sc = new Scanner(System.in);

        System.out.println("x 값 입력 : " );
        String strX = sc.nextLine();

        System.out.println("y 값 입력 : ");
        String strY = sc.nextLine();

        int x = Integer.parseInt(strX);
        int y = Integer.parseInt(strY);

        int res = x + y;
        System.out.println(" x  +  y =  " +  res);
        System.out.println();

        while (true) {
            System.out.print("입력 문자열 : ");
            String data = sc.nextLine();
            if(data.equals("q")) {
                break;
            }
            System.out.println("출력 문자열 : " + data);

        }

        System.out.println("종료");
    }
}
