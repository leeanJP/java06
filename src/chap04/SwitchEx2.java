package chap04;

public class SwitchEx2 {
    public static void main(String[] args) {
        //Java 12 부터 switch 표현식 사용 가능

        char grade = 'B';

        switch (grade){
            case 'A' , 'a' -> System.out.println("우수 회원");
            case 'B' , 'b' -> {
                System.out.println("일반 회원");
            }
            case 'C' , 'c' -> {
                System.out.println("손님");
            }
        }
    }

}
