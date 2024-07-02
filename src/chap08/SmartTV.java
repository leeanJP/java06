package chap08;

public class SmartTV implements RemoteControl , Searchable{
    @Override
    public void turnOn() {
        System.out.println("SmartTV is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartTV is turned off");
    }

    @Override
    public void setVolume(int volume) {

    }

    @Override
    public void search(String url) {
        System.out.println(url + " 을 검색합니다.");
    }
}
