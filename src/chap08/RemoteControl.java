package chap08;

public interface RemoteControl {
    //필드

    //상수 필드
    //인터페이스에 선언된 필드는 모두 public static final 특성을 가진다.
    //상수명은 대문자로 작성
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;


    //인터페이스 추상메소드

    //인터페이스는 추상화 정도가 높아서 메소드에서 코드를 작성하면 오류 발생.
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    //default 메소드
    //인터페이스에서는 완전한 실행 코드를 가지는 디폴트 메소드를 선언할 수 있다.
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리 합니다.");
            //추상 메소드를 호출하면서 상수 필드 사용
            setVolume(MIN_VOLUME);
        }else {
            System.out.println("무음 해제 합니다.");
        }
    }

    //static 메소드
    //구현객체 없이 인터페이스만으로 호출할 수 있다.
    //항상 public (public 생략해도 컴파일 과정에서 붙는다)
    //상수필드를 제외한 추상메소드 디폴트 메소드 private 메소드를 호출 할 수 없다.
    static void changeBattery(){
        System.out.println("리모콘 건전지를 교환합니다. ");
    }

    //private 메소드
    //default 메소드에서만 호출 가능
    //default static 메소드에서 코드 중복을 줄이기 위함
    //private static 메소드
    //default, static 메소드에서 호출 가능


}
