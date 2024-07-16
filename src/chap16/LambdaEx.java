package chap16;

public class LambdaEx {

    //람다식은 익명함수를 간결하게 표시하는 방법

    public static void main(String[] args) {
        action((x,y) ->{
            int result = x + y;
            System.out.println("result : " + result);
        });

        action((x,y) -> {
            int result = x - y;
            System.out.println("result : " + result);
        });

        action((x,y) -> {
            int result = x * y;
            System.out.println("result : " + result);
        });
    }


    public static void action(Calculable calculable){
        //데이터
        int x = 10;
        int y = 4;
        //데이터 처리
        calculable.calculate(x, y);
    }
}
