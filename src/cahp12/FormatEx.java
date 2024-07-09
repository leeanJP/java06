package cahp12;

import java.text.DecimalFormat;

public class FormatEx {
    public static void main(String[] args) {
        //DecimalFormat  : 숫자를 형식화된 문자열로 변환
        double num = 1234567.89;

        DecimalFormat df = new DecimalFormat("\u00A4 #,###.###"); //천 단위 구분기호
        System.out.println(df.format(num));


        //SimpleDateFormat  : 날짜를 형식화된 문자열로 변환
    }
}
