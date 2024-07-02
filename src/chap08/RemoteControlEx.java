package chap08;

public class RemoteControlEx {
    public static void main(String[] args) {
        System.out.println("리모콘 최대 볼륨 " + RemoteControl.MAX_VOLUME);
        System.out.println("리모콘 최소 볼륨 " + RemoteControl.MIN_VOLUME);

        RemoteControl rc = new Television();
        RemoteControl.changeBattery();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);

        rc.setMute(false);

        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(20);

        rc.setMute(true);
        rc.setMute(false);

        rc.turnOff();


    }

}
