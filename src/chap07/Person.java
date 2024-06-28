package chap07;

public sealed class Person permits Employee, Manager, Student{
    //final 클래스를 제외하고 모든 클래스는 부모 클래스가 될 수 있다.
    //무분별한 자식클래스 생성을 방지하기 위해 봉인 클래스 도입됨

    //java 15부터 가능한 기능
    //java 8 java 11 java 17
    //봉인 클래스를 상속받은 클래스는 final 키워드를 넣어줘야한다.

    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void walk(){
        System.out.println("걸어감");
    }
}
