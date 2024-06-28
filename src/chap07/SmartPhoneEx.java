package chap07;

public class SmartPhoneEx {
    public static void main(String[] args) {
        //SmartPhone 객체 생성
        SmartPhone sp = new SmartPhone("갤럭시", "검정");

        //phone으로 부터 상속받은 필드 읽기
        System.out.println("모델  : " + sp.model);
        System.out.println("색상  : " + sp.color);

        //SmartPhone 의 필드 읽기
        System.out.println("와이파이 상태 : " + sp.wifi );

        //상속받은 메소드 호출
        sp.bell();
        sp.sendVoice("여보세요?");
        sp.recordVoice("안녕하세요~");
        sp.hangUp();

        //SmartPhone 메소드 호출
        sp.setWifi(true);
        sp.internet();


    }
}

