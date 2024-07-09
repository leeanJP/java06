package cahp12;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        //문자열이 구분자로 연결되어 있을 경우 해당 구분자로 문자열을 분리 할 때 사용

        String data = "홍길동&이수홍,박연수,김자바-최용호";
        String[] names = data.split("&|,|-");

        for(String token : names){
            System.out.println(token);
        }

        String data1 = "홍길동-이수홍-박연수-김자바-최용호";
        StringTokenizer st  = new StringTokenizer(data1, "-");
        System.out.println("===================");
        while (st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);

        }


    }
}
