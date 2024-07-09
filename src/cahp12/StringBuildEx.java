package cahp12;

public class StringBuildEx {
    public static void main(String[] args) {
        //String은 고쳐쓸 수 없다.
        String data = "ABC";
        data +=  "DEF";

        //StringBuilder 은 문자열을 조작할 때 사용하는 클래스
        //잦은 문자열 변경이 일어난다면 String보다 StringBuilder를 쓰는게 효과적
        //append   : 문자열 끝에 추가
        //insert   : 문자열을 지정 위치에 추가
        //delete   : 문자열 일부 삭제
        //replace  : 문자열 일부를 대체
        //toString  : 완성된 문자열을 리턴

        String sb = new StringBuilder()
                .append("DEF")  //DEF
                .insert(0, "ABC")   //ABCDEF
                .delete(3,5)
                .toString();
        //메소드 체이닝
        System.out.println(sb);
    }
}
