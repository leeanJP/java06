package chap08;

public class MultiInterfaceEx {
    public static void main(String[] args) {
        //RemoteControl 인터페이스 변수 선언 구현객체 대입
        RemoteControl rc = new SmartTV();

        //RemoteControl 인터페이스에서 선언된 추상메소드만 사용 가능
        rc.turnOn();
        rc.turnOff();
        //rc.search();

        //Searchable 인터페이스 변수 선언 및 구현 객체 대입\
        Searchable searchable = new SmartTV();
        searchable.search("www.naver.com");
        //searchable.turnOn();

        SmartTV sm = new SmartTV();
        sm.turnOn();
        sm.search("www.naver.com");
        sm.turnOff();



    }
}
