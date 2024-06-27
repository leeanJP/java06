package chap06;

public class KoreanEx {
    public static void main(String[] args) {
        //객체 생성 시 주민등록번화와 이름 전달
        Korean k1 = new Korean("123456-1111111", "김자바");

        // 필드값 읽기
        System.out.println(k1.NATION);
        System.out.println(k1.SSN);
        System.out.println(k1.name);

        //final 필드 값 변경
//        k1.NATION = "JAPAN";
//        k1.SSN = "1111111-1111111";
        k1.name = "김파이썬";

        System.out.println(k1.name);
    }
}
