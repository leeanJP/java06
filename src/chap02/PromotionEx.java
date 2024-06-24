package chap02;

public class PromotionEx {
    public static void main(String[] args) {
        //타입 변환은

        //자동 타입 변환 (묵시적 형변환)
        //
        byte byteValue = 10;
        int intValue = byteValue;
        int result = intValue +10;
        //큰 허용범위 타입의 변수에 작은 허용범위 변수를 집어넣으면 자동으로 변환된다.
        //강제 타입 변환 (명시적 형변환)

        //작은 허용범위 타입의 변수에 큰 허용범위 변수를 집어넣으려고 하면
        // 그냥은 할수없고
        // 개발자가 직접 형변환에대해 책임지겠다는 문구를 넣어줘야 가능하다.
        // 강제 형변환은 데이터에 소실이 일어날 수 있다.

        int intValue2 = 1000000000;
        byte byteValue2 = (byte)intValue2;

        System.out.println(byteValue2 + " : " + intValue2 );

        //자동 타입변환 예시
        char charValue = 'A';
        intValue  = charValue;
        System.out.println(intValue);

        //강제 타입변환 예시
        int var1 = 10;
        byte var2 = (byte) var1;

        System.out.println(var2);

        double var3 = 3.14;
        int var4 = (int) var3;

        System.out.println(var4);

        //연산식에서 자동 타입변환

        byte res = 10 + 20; //컴파일단계에서 연산을 마치고 저장이된다.
        //실행 시 덧셈 연산이 없어서 실행 성능이 향상된다.
        System.out.println(res);


        int intVal = 10;
        double doubleVal = 5.5;
        int res2 = intVal + (int) doubleVal;

        System.out.println(res2);
        int x =  1;
        int y = 2;

        double res3 =  x/y; //정수형
        System.out.println(res3);

        //정수와 String +
        int val = 3+ 7; // 10
        String str = "3" + 7; // "37"
        String str2 = 3 + "7" ; // "37"

        System.out.println(val + " : " + str + str2);

        //문자열을 기본타입으로 변환

        String intStr = "300000";
        int intVal2 = Integer.parseInt(intStr);

        //byte b = Byte.parseByte(intStr);
        System.out.println( intVal2);

        //기본 타입의 값을 문자열로 변환

        String str1 = String.valueOf(10);
        System.out.println(str1);

    }
}
