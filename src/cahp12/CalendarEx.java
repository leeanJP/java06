package cahp12;

import java.util.Calendar;

public class CalendarEx {
    public static void main(String[] args) {
        //달력을 표현하는 추상 클래스

        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int day = now.get(Calendar.DAY_OF_MONTH);
        int hour = now.get(Calendar.HOUR);
        int min = now.get(Calendar.MINUTE);
        int sce = now.get(Calendar.SECOND);
        System.out.println();
    }

}
