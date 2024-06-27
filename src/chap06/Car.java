package chap06;

import hankook.*;
import kumho.*;

public class Car {
    //필드 선언과 사용
    //데이터 타입 필드명 [=초기값};
    //고유 데이터
    String company;
    //String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    //상태 데이터
    private int speed;
    int rpm;
    int gas;
    //부품 데이터
//    Body body;
//    Engine engine;
//    Tire tire;


    //생성자
    // new 연산자는 객체를 생성한 후 연이어 생성자를 호출해서 객체를 초기화하는 역할을 한다.
    // 객체 초기화는 필드를 초기화하고, 메소드를 호출해서 객체를 사용할 준비를 하는 것.
    // 생성자가 실행이 끝나면 new 연산자는 객체의 주소를 리턴한다.
    // 리턴된 주소는 변수에 대입되어 객체의 필드나 메소드에 접근할 때 이용된다.

    //기본 생성자
    // 모든 클래스는 생성자가 존재하고 하나 이상을 가질 수 있다.
    // 클래스에 생성자가 없으면 컴파일러는 기본생성자를 자동으로 추가한다.
    // 기본 생성자의 형태는
    // pubilc 클래스명() {}

    //생성자 선언
    // 기본 형태 :
    // 클래스(매개변수1, 2, 3,....) {
    //      객체의 초기화 코드
    // }

    //생성자 오버로딩
    Car() {

    }

    Car(String model, String color ,int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    //메소드 선언과 호출
    //메소드 선언은 객체의 동작을 실행 블록으로 정의하는 것
    //메소드 호출은 실행 블록을 실제로 실행 하는 것

    //메소드 선언 기본형태
    //리턴타입 메소드명(파라메터1, 2...) {
    //   실행 블록
    //  실행할 코드를 작성하는 곳
    // }

    //리턴값이 없는 메소드
    void powerOn(){
        System.out.println("시동 걸림");
    }
    void powerOff(){
        System.out.println("시동 꺼짐");
    }

    //리턴값이 있는 메소드
    //현재 속드롤 반환하는 메소드
    public int getSpeed() {
        return speed;
    }

    //모델을 반환하는 메소드
    String getModel(){
        return model;
    }

    void setGas(int gas){
        this.gas = gas;
    }

    boolean isLeftGas() {
        if(gas == 0){
            System.out.println("gas가 없음");
            return false;
        }
        System.out.println("gas 있음");
        return true;
    }

    void run() {
        while (true){
            if(gas >0){
                System.out.println("달립니다 . (gas 잔량 : " + gas + " )" );
                gas -= 1;
            }else {
                System.out.println("멈춥니다 . (gas 잔량 : " + gas + " )" );
                return;
            }
        }
    }

    //메소드 오버로딩
    //메소드 이름은 같고 매개변수의 타입, 이름 , 순서가 다른 메소드를 여러개 선언하는 것



    // static  정적 멤버 (필드 메소드)
    // 클래스 자체에 속한다.
    // 객체를 생성하지 않고 사용이 가능하다.
    // 객체가 없어도 실행이 가능하기 때문에 해당 객체 자신을 참조하는 this 사용할 수 없다.
    // 정적 메소드와 정적 블록은 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다.


    // 클래스의 로딩 시점
    // JAVA 프로그램이 실행되면 JVM 필요한 클래스를 로드한다.
    // 이때 클래스의 정적 멤버가 초기화 된다.
    // 클래스가 메모리에 로드되면 정적멤버는 언제든 사용이 가능하다.
    // 정적멤버는 모든 객체가 공유하므로 전역 변수처럼 사용할 수 있다.


    //인스턴스 멤버 (필드, 메소드)
    // 각 객체에 속한다.
    // 객체를 생성한 후에 사용 가능




    int test; //인스턴스 필드
    static int test1; //정적 필드

    //인스턴스 메소드
    //정적 static  메소드
    static void test() {

    }


    kumho.Tire tire = new kumho.Tire();


    //접근 제한자

    // 객체의 필드를 외부에서 변경하거나 메소드를 호출수 없도록 막야할 필요가 있을 때
    // 접근제어자 or 접근제한자를 통해 제어할 수 있다.

    // public
    // 모든 클래스에서 접근 가능
    // protected
    // 같은 패키지 내의 클래스 혹은 자식 클래스 객체만 사용 가능
    // default
    // 동일 패키지 내에서만 접근 가능
    // private
    // 동일 클래스 내에서만 접근 가능

    //Getter Setter
    //객체의 필드를 외부에서 마음대로 읽고 변경할 경우 객체의 무결성이 깨진다.

    //직접적으로 외부에서 필드에 접근하는 것을 막고 메소드를 통해서 필드에
    //접근하는 것을 선호한다.

    //메소드를 통해 데이터가 유효한지 검증하고 필드에 저장함.
    //Setter

    public void setSpeed(int speed) {
        if(speed < 0){
            this.speed = 0;
            return;
        }else {
            this.speed = speed;
        }
    }

    //싱글톤 패턴
    //객체지향 프로그래밍에서 특정 클래스가 단 하나만의 인스턴스를 생성해서
    //사용하기 위한 디자인 패턴
    //생성자를 private 접근 제한해 외부에서 new 연산자로 생성자를 호출 할 수 없다.


}
