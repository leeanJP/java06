package chap07.ab;

public abstract class Phone {
    //추상 클래스 특징
    //하나 이상의 추상 메소드를 포함 할 수 있다.
    //일반 메소드도 포함 할 수 있다.
    //인스턴스화 할수 없다.
    //자식 클래스는 추상 클래스의 모든 추상 메소드를 구현해야한다.

    //추상메소드 선언 방법
    //abstract 리턴타입 메소드명(){...}

    //추상메소드 특징
    //선언만 있고 구현이 없다.
    // 실제 구현은 상속받은 작식클래스에서 이루어진다.
    // 강제 구현 : 추상메소드를 상속받는 클래스는 반드시 해당 메소드를 구현해야 한다.



    //필드 선언
    String owner;

    //생성자 선언
    Phone(String owner){
        this.owner = owner;
    }

    //메소드 선언
    void turnOn(){
        System.out.println("폰 전원 ON");
    }
    void turnOff(){
        System.out.println("폰 전원 OFF");
    }
}
