package chap02;

public class PrintEx {

    public static void main(String[] args) {
        //출력 방법

        //1. println() 괄호 안에 내용을 출력하고 줄을 바꾼다.
        //2. print()   괄호안에 내용을 출력하라.
        //3. printf("형식문자열", 값1, 값2 ....); 형식문자열에 맞춰서 뒤의 값을 출력하라.

        int value = 123;
        System.out.printf("상품의 가격 : %d원\n " , value);
        System.out.printf("상품의 가격 : %6d원\n " , value);
        System.out.printf("상품의 가격 : %-6d원\n " , value);
        System.out.printf("상품의 가격 : %06d원\n " , value);


        double area = 3.14 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이 : %010.2f\n" , 10 , area); //정수7자리 + 소수점 + 소수점2

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n" , 1 ,  name, job);

    }
}
