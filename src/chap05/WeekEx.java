package chap05;

import java.util.Calendar;

public class WeekEx {
    public static void main(String[] args) {
        //날짜 요일 시간을 가져오는 Calendar

        Calendar now = Calendar.getInstance(); //캘린더 객체 가져온다.

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        System.out.println(month);
        int day = now.get(Calendar.DAY_OF_MONTH);

        //열거 타입 변수 선언
        Week today = null;

        //오늘의 요일 얻기
        int week = now.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);

        //숫자를 열거 상수로 변환해서 변수에 대입
        switch (week) {
            case 1 : today = Week.SUNDAY; break;
            case 2 : today = Week.MONDAY; break;
            case 3 : today = Week.TUESDAY; break;
            case 4 : today = Week.WEDNESDAY; break;
            case 5 : today = Week.THURSDAY; break;
            case 6 : today = Week.FRIDAY; break;
            case 7 : today = Week.SATURDAY; break;
        }

        System.out.println(today);

    }
}
