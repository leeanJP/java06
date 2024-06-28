package chap07;

public class SmartPhone extends Phone{

    //필드 선언
    public boolean wifi;

    //생성자 선언
    public SmartPhone(String model, String color){
        super(model, color);
        System.out.println("SmartPhone 생성자 실행됨");
    }

    //메소드 선언
    public  void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("wifi 상태를 변경했습니다.");

    }

    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }

//    @Override
//    public void off(){
//      final 메소는 재정의 X
//    }
}
