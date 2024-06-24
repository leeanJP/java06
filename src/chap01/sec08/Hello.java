package chap01.sec08;

/**
 * @author 작성자
 *
 * @version v.1.0
 *
 * @since 2024.06.24
 */
public class Hello {
    public static void main(String[] args) {
        //메인 메소드는 바이트 코드 파일을 실행하면 main 메소드가 실행된다.
        //실행 진입점이라고 부른다.
        System.out.println("Hello World!");

        // 한 행을 주석
        /* */ //범위 주석
        /**
         *  javaDoc
         * */

        int x; // 변수 x 선언
        x = 1; // x에 1을 대입
        int y = 2; // 변수 y 를 선언하면서 값에 2를 대입

        int result = x + y;
        System.out.println(result);


    }
}
