package chap07.ab;

public abstract class Animal {
    //메소드 선언
    public void breath(){
        System.out.println("숨을 쉽니다.");
    }
    //추상메소드
    public abstract void sound();
}
