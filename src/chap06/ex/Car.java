package chap06.ex;

import chap05.Week;

public class Car {

    //같은 패키지에 있는 클래스는 아무 제약없이 사용 가능하지만
    //다른 패키지에 있는 클래스는 import 문을 이용해서 어떤 패키지의 클래스를 사용하는지
    //명시해야한다.
    Week week;


    //인스턴스 필드
    int speed;

    //인스턴스 메소드
    void run() {
        System.out.println(speed+" 로 달립니다.");
    }

    static void simulate() {
        //객체 생성
        Car car = new Car();

        //인스턴스 멤버 사용
        car.speed = 60;
        car.run();

    }

    public static void main(String[] args) {
//        speed = 60;
//        run();

//        Car car = new Car();
//        car.speed = 60;
//        car.run();
        simulate();
    }
}
