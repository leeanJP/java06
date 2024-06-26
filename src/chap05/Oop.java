package chap05;

public class Oop {
/*
    객체 지향 프로그래밍(Object Oriented Programming OOP)은
    프로그래밍에서 필요한 데이터를 추상화 시켜 상태와 행위를 가진
    객체로 만들고, 객체들간의 상호작용을 통해 로직을 구성하는
    프로그래밍 방법

    객체란 프로그램에서 사용되는 데이터 또는 식별자에 의해 참조되는
    공간을 의미한다. 값을 저항 변수와 작업을 수행할 메소드를 서로 연관된
    것들끼리 묶어서 만든것이 객체.

    Java JS

    OOP 특징 - 추상화 캡슣화 상속 다형성
    1.추상화
    - 객체에서 공통된 속성과 행위를 추출하는것
    - 공통의 속성과 행위를 찾아서 타입을 정의하는 과정
    - 추상화는 불필요한 정보는 숨기고 중요한 정보만 표현함으로써
    프로그램을 간단하게 만드는 것

    2.캡슐화
    - 데이터 구조와 데이터를 다루는 방법들을 결합시켜 묶는것
    (변수와 함수를 하나로 묶는 것)
    - 낮은 결합도를 유지할 수 있도록 설계하는 것
        로그인 회원가입 글쓰기 ....
    - 속성과 기능을 정의하는 변수와 메소드를 클래스라는 캡슐에 넣어서 분류하는 것
    - 정보은닉을 할 수 있다.(접근제어자)

    3. 상속
    - 클래스의 속성과 행위를 하위 클래스에 물려주거나 하위 클래스가 상위 클래스의 속성과 행위를 물려받는 것
    장점 :    재사용으로 인해 코드가 줄어들고, 범용적으로 사용이 가능하다.
    단점 :    상위클래스는 변경이 어렵다. 불필요한 클래스가 증가할 수 있다. 상속이 잘못 사용될 수 있다.


    4. 다형성
    - 하나의 변수명, 함수명이 상황에 따라 다른 의미로 해석될 수 있는것

    오버라이딩 : 상위 클래스가 가지고 있는 메소드를 하위 클래스에서 재정의해서 사용하는 것
    오버로딩 : 같은 이름의 메소드가 인자의 개수나 자료형에 따라 다른 기능을 하는것


    객체지향 프로그래밍에 장단점

    장점
    - 클래스단위로 모듈화 시켜서 개발하기 때문에 업무 분담이 쉽고 대규모 소프트웨어 개발에 적합하다.
    - 클래스단위로 수정이 가능하기 때문에 유지보수가 편리하다.
    - 클새를 재사용하거나 상속을 통해 확장함으로써 코드 재사용이 편리하다.

    단점
    - 처리속도가 상대적으로 느리다
    - 객체의 수가 많아지면 용량이 커질 수 있다.
    - 셜계시 많은 시간과 노력이 필요할 수 있다.

    SOLID 객체지향 설계원칙



    기본 타입으로 선언된 변수는 값 자체를 저장하고 있다.
    참조 타입으로 선언된 변수는 객체가 생성된 메모리 번지를 저장한다.


    객체란 물리적으로 존재하거 개념적인 것 중 다른것과 식별 가능한 것을 뜻한다.
    예) 사람 자동차 강의 주문
    객체는 속성과 동작으로 구성된다.
    사람 : 이름 , 나이 ,전공, 몸무게 , 신장 등등...
    속성을 필드 , 동작 메소드라고 부른다.

    객체는 단독으로 존재할 수 있지만 대부분 다른 객체와 관계를 맺고있다.

    집합 관계
    사용 관계
    상속 관계

* */

    public static void main(String[] args) {
        //참조 타입변수는 아직 번지를 저장하지 않았다는 의미로 null 값을 가질 수 있다.

        String var1 = "자바";
        String var2 = null;

        System.out.println(var1 != null);
        System.out.println(var2 == null);

        int[] intArray = null;



    }


}
