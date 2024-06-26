package chap04;

public class IfEx {
    public static void main(String[] args) {

        //if 문 기본형식

//        if(조건식1) {
//
//        }else if(조건식2) {
//
//        }else {

//        }

        int score = 85;

        if(score >= 90){
            System.out.println("점수가 100~90입니다.");
            System.out.println("등급은 A 입니다.");
        } else if(score>=80) {
            System.out.println("점수가 80~89 입니다.");
            System.out.println("등급은 B 입니다.");
        } else if(score>=70) {
            System.out.println("점수가 70~79 입니다.");
            System.out.println("등급은 C 입니다.");
        } else {
            System.out.println("점수가 70 미만 입니다.");
            System.out.println("등급은 D 입니다.");
        }

        //임의의 정수를 뽑는 Math.random()
        // 0.0 ~ 1.0 의 수를 랜덤하게 리턴을 해준다.

        int num  = (int)Math.random() *6+ 1 ;   // 1~ 6까지 리턴을 해준다  1~45

        if(num == 1) {
            System.out.println("주사위 1나옴");
        }else if(num ==2){
            System.out.println("주사위 2나옴");

        }


    }
}
