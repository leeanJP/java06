package chap05;

public class AdvancedForEx {
    public static void main(String[] args) {
        int[] arr = {90,80,70,60,50};

        int sum = 0;

        //향상 for문 기본 형태
//        for(자료형 변수명 : 배열){
//            //반복해서 동작할 코드~~
//        }


        for(int score : arr) {
            sum += score;
        }
        System.out.println("점수 총합 : " + sum);
    }
}
