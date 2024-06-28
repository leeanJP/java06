package chap07;

public class CarEx {
    public static void main(String[] args) {
        Car car = new Car();

        //Tire 객체 장착
        car.tire = new Tire();
        car.run();

        //한국타이어 객체 장착
        car.tire = new HankookTire();
        car.run();

        //금호타이어 객체 장착
        car.tire = new KumhoTire();
        car.run();
    }
}
