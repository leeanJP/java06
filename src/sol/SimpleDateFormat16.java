package sol;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat16 {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 E요일 HH:mm");

        System.out.println(sdf.format(now));
    }

}
