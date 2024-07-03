package chap11;

public class ExceptionHandlerEx2 {
    public static void printLength(String data){
        try {
            //실행할 코드 (오류 발생가능성이 있음)
            int result = data.length();
            System.out.println("문자 수 : " + result);
        }catch (NullPointerException e){
            //예외처리 해준다.
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
            e.printStackTrace();
        }finally {
            //오류 여부에 상관없이 동작함
            System.out.println("마무리 실행");
        }
    }

    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("프로그램 종료");
    }
}
