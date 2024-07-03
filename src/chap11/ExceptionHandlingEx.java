package chap11;

public class ExceptionHandlingEx {
    public static void main(String[] args) {
        try {
            //주어진 클래스를 찾는 코드
            Class.forName("java.lang.String");
            System.out.println("java.lang.String 클래스가 존재합니다.");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try {
            Class.forName("java.lang.String2");
            System.out.println("java.lang.String2 클래스가 존재합니다.");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
