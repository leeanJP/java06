package chap07.ab;

public class PhoneEx {
    public static void main(String[] args) {
        //추상 메소드는 인스턴스화 할수없다.
        //Phone phone = new Phone();

        SmartPhone sp = new SmartPhone("홍길동");
        sp.turnOn();
        sp.internetSearch();
        sp.turnOff();
    }
}
