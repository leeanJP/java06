package chap11;

public class ThrowsEx {
    //java에서 예외발생 하면 try - catch 예외처리하는 게 일반적이다.
    //throws 이용해서 메소드 호출한곳으로 예외를 떠넘길 수 있다.

    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("예외처리 " + e.getMessage());
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
