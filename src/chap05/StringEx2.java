package chap05;

public class StringEx2 {
    public static void main(String[] args) {
        //  💡 equals : 대소문자 구분하여 비교
        String str_a1 = "Hello World";
        String str_a2 = new String("Hello World");
        String str_a3 = "HELLO WORLD";

        boolean bool_a0 = str_a1 == str_a2;  // ⚠️ 문자열은 이렇게 비교하지 말 것!

        boolean bool_a1 = str_a1.equals(str_a2);
        boolean bool_a2 = str_a1.equals(str_a3);

        //  💡 equalsIgnoreCase : 대소문자 구분하지 않고 비교
        boolean bool_a3 = str_a1.equalsIgnoreCase(str_a3);
        boolean bool_a4 = str_a2.equalsIgnoreCase(str_a3);


        //대소문자 변환
        String str_b1 = str_a1.toUpperCase(); //대문자 변환
        String str_b2 = str_a3.toLowerCase(); //소문자로 변환


        String str_c1 = "Hi! How are you? I'm fine. Thank you!";
        String str_c2 = "how";

        boolean b1 = str_c1.contains(str_c2);

        boolean b2 = str_c1.toUpperCase().contains(str_c2.toUpperCase());
        boolean b3 = str_c1.toLowerCase().contains(str_c2.toLowerCase());

        //문자 이어붙이기
        //concat 문자열을 뒤로 이어붙인다

        String s1 = "슉-";
        String s2 = "슈슉-";
        String s3 = "슈슈슉-";

        String s4 = s1 + s2 + s3;

        String s5 = s1.concat(s2);

        //메소드 체이닝
        String s6 = s1.concat(s2)
                    .concat(s3)
                    .concat(s4);

        //concat은 문자만 이어붙일 수 있다.
        String s7 = s1
//                .concat(true)
//                .concat(1)
//                .concat(1.34)
//                .concat('가')
                ;



    }
}
