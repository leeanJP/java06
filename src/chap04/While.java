package chap04;

public class While {
    public static void main(String[] args) {
        //기본 형식

//        while (조건식) {
//            조건식이 true 실행할 코드 ~~
//
//        }

        int sum = 0;
        int i = 101;

        while (i <=100){
            sum += i;
            i++;
        }

        System.out.println(" 1 ~ " + (i-1) + "까지의 합 은 " + sum);


    }
}
