package cahp12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date now = new Date(); //컴퓨터의 현재 날짜를 읽어 Date 객체로 만든다.
        System.out.println(now.toString());

        SimpleDateFormat  sdf = new SimpleDateFormat("YYYY/MM/dd a hh:mm:ss");
        String strNow = sdf.format(now);
        System.out.println(strNow);


    }
}
