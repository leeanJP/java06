package chap06;

public class CarEx {
    public static void main(String[] args) {
        //Car 객체 생성 (인스턴스화)
        //클래스의 객체를 생성하는 과정을 인스턴스화
        Car car = new Car("현대자동차", "검정", 200);
        Car car2 = new Car("포르쉐", "빨강");
        Car car3 = new Car();
        //Car 객체의 필드값 읽기
        System.out.println("차1 제조회사  : " + car.company);
        System.out.println("차2 제조회사  : " + car2.company);
        System.out.println("차량 색깔  : " + car.color);
        System.out.println("차 모델  : " + car.model);
        System.out.println("차 최고 속도  : " + car.maxSpeed);

        System.out.println("차 현재 속도 : " + car.getSpeed());
        //car.speed = 60;
        car.setSpeed(60);
        System.out.println("차 현재 속도 : " + car.getSpeed());

        car.setGas(5);
        car.setSpeed(-100);
        System.out.println("차 현재 속도 : " + car.getSpeed());

        if(car.isLeftGas()){
            System.out.println("출발");
            car.run();

        }
        System.out.println("가스를 충전하세요");
    }
}
