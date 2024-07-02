package chap08;

public class Audio implements RemoteControl{
    int volume;

    @Override
    public void turnOn() {
        System.out.println("Turning on audio");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오 끔");
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
        System.out.println("현재 오디오 볼륨 : " + this.volume);
    }

    //필드
    private int memoryVolume;

    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음 처리 합니다.");
            //추상 메소드를 호출하면서 상수 필드 사용
            setVolume(MIN_VOLUME);
        }else {
            System.out.println("무음 해제 합니다.");
            setVolume(this.memoryVolume);
        }
    }
}
