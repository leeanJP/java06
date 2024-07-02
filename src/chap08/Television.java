package chap08;

public class Television implements RemoteControl{
    //인터페이스도 하나의 타입 변수의 타입으로 사용할 수 있다.
    //인터페이스는 참조 타입에 속하므로 인터페이스 변수에는
    //객체를 참조하고 있지 않다는 뜻으로 null 대입 할 수 있다.

    int volume;

    RemoteControl rc = null;

    //인터페이스를 통해 구현 객체를 사용하려면
    //인터페이스 변수에 구현객체를 대입해야함.
    //rc = new Television();


    @Override
    public void turnOn() {
        System.out.println("Television is on");
    }

    @Override
    public void turnOff() {
        System.out.println("티비 끔");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume <RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }
}
