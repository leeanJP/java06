package chap03;

public class OperatorEx2 {
    public static void main(String[] args) {
        // 비교 연산자
        // == 값이 같은지 비교
        // != 값이 다른지 비교
        // > >= < <=

//        String str1  = "test";
//        String str2  = "test";
//
//        boolean result = str1.equals(str2); // true
//        boolean result2 = !str1.equals(str2); //false
//
//        System.out.println( result );
//        System.out.println(result2);

        //논리 연산자
        // A && B   A , B 모두 참이어야만 결과가 참
        // A || B   A, B 둘중 하나라도 참이면 참
        // !   true > false  flase > true
        // A ^ B    하나는 true고 하나는 fasle여야만 true

//        int  charCode = 'A';
//        int  charCode = 'a';
        int  charCode = '5';


        if( (65<=charCode) & (charCode<=90) ) {
            System.out.println("대문자 이군요");
        }

        if( (97<=charCode) && (charCode<=122) ) {
            System.out.println("소문자 이군요");
        }

        if( (48<=charCode) && (charCode<=57) ) {
            System.out.println("0~9 숫자 이군요");
        }

        //----------------------------------------------------------

        int value = 6;
        //int value = 7;

        if( (value%2==0) | (value%3==0) ) {
            System.out.println("2 또는 3의 배수 이군요");
        }

        boolean result = (value%2==0) || (value%3==0);
        if( !result ) {
            System.out.println("2 또는 3의 배수가 아니군요.");
        }

        // 대입 연산자
        // =   오른쪽 값을 왼쪽에 넣어라

        // 복합 대입연산자
        // +=   -=  *= /= %=
        int res = 0;
        res += 10;
//        res = res + 10;
        System.out.println( res);
        res -= 5;
        System.out.println( res);


        //삼항 연산자
        //  ?  :

        int score = 85;
        char grade = (score >90) ? 'A' : (score > 80) ? 'B' : 'C';
        System.out.println(grade);


        // 연산의 방향과 우선순위
        // 연산 방향 대부분은 정방향 --- >>
        // 증감 논리 대입연산자는 역방향 << ---

        int a = 100* 2 / 3 % 5;
        int b, c ,d ; // 변수 선언 연속으로 가능
        a = b= c = 5;

    }
}
