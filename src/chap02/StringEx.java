package chap02;

public class StringEx {
    public static void main(String[] args) {
        //String 문자열 자료형
        // char '' String ""

//        char c01 = "a";
//        String s01 = 'a';

        String s01 = "Hello World";
        String s02 = ""; //빈 문자열도 선언 가능

        //리터럴로 생성시에는 String Constant pool 이라는 곳에 중복없이 저장된다.
        String h1 = "Hello";
        String h2 = "Hello";
        //인스턴스로 생성 시 매번 새로 생성되어서 각자 메모리를 차지한다.
        String h3 = new String("Hello");
        String h4 = new String("Hello");
        String h5 = h4;
        System.out.println(h1 + " : " + h2 + " : " + h3) ;
        boolean b01 = h1 == h2;
        boolean b02 = h1 == h3;
        boolean b03 = h1.equals(h3); //String 비교할때에는 == .equals 메소드를 사용해야한다.
        System.out.println(b01);
        System.out.println(b02);
        System.out.println(b03);


        //이스케이프 문자

        String name = "홍길동";
        String job = "프로그래머";

        String str = " 나는 \"자바\" 를 공부합니다. ";
        System.out.println(str);
        str = "번호 \t 이름 \t 직업";
        System.out.println(str);
        System.out.print("나는 \n");
        System.out.print("자바를 \n");
        System.out.print("배웁니다. \n");


        String block = """
                내가 원하는 내용을
                작성하면
                그대로 표현 "" 해준다 ?? 
                        ㄴ어ㅏㅣ뫼
                        
                """;

        System.out.println(block);


    }
}
