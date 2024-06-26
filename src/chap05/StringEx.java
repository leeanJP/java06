package chap05;

public class StringEx {
    public static void main(String[] args) {
        //문자 추출

        String subject = "자바 프로그래밍";
        char charVar = subject.charAt(3);

        System.out.println(charVar);

        //문자열 길이
        int len = subject.length();
        System.out.println(len);

        String ssn = "8812341234567";
        int len2 = ssn.length();

        if(len2 == 13){
            System.out.println("주민번호 자릿수가 맞습니다.");
        }else {

            System.out.println("주민번호 자릿수가 틀립니다.");
        }


        //문자열 대체
        // subject = "자바 프로그래밍"
        String sub2 = "자바 프로그래밍 자바 자바";
        String newStr = subject.replace("자바", "JAVA");
        String newStr2 = sub2.replace("자바", "JAVA");
        // JAVA 프로그래밍
        System.out.println(subject);
        System.out.println(newStr);

        //문자열 잘라내기
        String firstNum = ssn.substring(0, 6);
        String secondNum = ssn.substring(7);

        System.out.println(firstNum);
        System.out.println(secondNum);

        //문자열 찾기
        int index = subject.indexOf("JAVA");
        System.out.println(index);

        boolean result = subject.contains("Python");
        System.out.println(result);

        //문자열 분리
        String board = "번호-제목-내용-성명";
        String[] arr = board.split("-");
        System.out.println(arr[0]);

        //빈 문자열 여부
        String str1 = "";
        String str2 = "\t\n";

        //isEmpty : 문자열의 길이가 0인지 여부
        boolean bool1 = str1.isEmpty();
        boolean bool2 = str2.isEmpty();
        System.out.println(bool1 + " :" + bool2);

        //isBlank : 공백을 제외한 문자열의 길이가 0인지 여부
        boolean bool3 = str1.isBlank();
        boolean bool4 = str2.isBlank();
        System.out.println(bool3 + " :" + bool4);

        //trim : 문자열 앞뒤의 공백을 제거
        String str3 = "\t 이 거 어 디 까지 올라가는 거 에 요?? \n";
        String str4 = str3.trim();

        System.out.println(str3);
        System.out.println(str4);


        //정규식 일치 여부
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        String mail = "zzzttt9@gamil.com";

        boolean boo1_mail = mail.matches(emailRegex);

        System.out.println(boo1_mail);

        //문자열 비교
        String str_a1 = "ABC";
        String str_a2 = "ABCDEF";
        String str_a3 = "ABCDEFG";

        //compareTo : 사전순 비교에 따라 양수 or 음수 반환

        //같은 문자열이면 0 반환
        int int_a1 = str_a1.compareTo(str_a1);

        //시작하는 부분이 같을 때는 글자 길이의 차이 반환
        int int_a2 = str_a1.compareTo(str_a2);
        int int_a3 = str_a1.compareTo(str_a3);
        int int_a4 = str_a2.compareTo(str_a3);
        int int_a5 = str_a3.compareTo(str_a1);

        //시작하는 부분이 다를 때는 첫 글자의 정수값 차이 반환
        String str_a4 = "HIJK";
        int int_a6 = str_a1.compareTo(str_a4);

        String str_b1 = "abc";
        int int_b1 = str_a1.compareTo(str_b1);
        //대소문자 구분 없이 비교
        int int_b2 = str_a1.compareToIgnoreCase(str_b1);


    }
}
