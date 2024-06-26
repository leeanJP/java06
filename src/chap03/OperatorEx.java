package chap03;

public class OperatorEx {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        //증감 연산자  (++ , --)
        int res1 = ++x + 10;  //12  x = 2
        int res2 = y++ + 10;  //11  y = 2

        System.out.println(res1 +  " : " + res2);

        //산술 연산자 + - * / %
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        //byte short char int 연산 결과는 int 타입이다.
        int result1 = v1 + v2; //모든 피연산자는 int 타입으로 자동 변환 후에 연산

        //피연산자가 정수 타입이고 하나라도 long 타입일 경우 연산결과는 long 타입
        long result2 = v1 +v2 + v4;  // 모든 피연산자는 long타입으로 자동 변환 후에 연산

        //피연산자중 하나가 실수 타입이면 연산의 결과는 실수타입이다.
        double result3 = (double) v1 / v2; // double 타입으로 강제 변환 후에 연산

        int result4 = v1 % v2 ;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);


        //오버플로우 : 타입이 허용하는 최대값을 벗어나는 경우
        //언더플로우 : 타입이 허용하는 최소값을 벗어나는 경우
        // byte  -128 ~ 127

        byte overflow = 127;
        overflow++;
        System.out.println(overflow);

        byte underflow = -128;
        underflow--;
        System.out.println(underflow);


        //정확한 계산은 정수 연산으로 한다.
        //산술 연산을 정확하게 계산하고 싶을 때에는 실수타입을 사용하지 않는게 좋다.

        int apple = 1 ;
        double pieceUnit = 0.1;
        int totalPieces = apple * 10;

        int number = 7;

        double result = apple - number * pieceUnit;
        System.out.println(result); // 0.3조각이 남아야함
        // 컴퓨터는 2진수로 바꿔서 계산하고 그결과값을 다시 10진수로 돌려준다.
        result2 = totalPieces - number;
        System.out.println("10조각에서 남은 조각" + result2); //3조각
        System.out.println("사과 1개에서 남은 양 : " + result2/10.0); // 0.3

        //나눗셈 연산 후 NaN , Infinity 처리

        int z = 5;
//        System.out.println(z/0); > Infinity
//        System.out.println(z%0); > NaN (Not a Number)
        double y1 = 0.0;
        double y2 = z/y1;


        if(Double.isInfinite(y2) || Double.isNaN(y2)){
            System.out.println("값 산출 불가");
        }else {
            System.out.println(y2 +2);
        }


    }

}
