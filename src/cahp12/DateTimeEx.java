package cahp12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeEx {
    public static void main(String[] args) {
        //날짜를 조작할 때에는 LocalDateTime 클래스 사용

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        System.out.println("현재시각 : " + now.format(dtf));

        LocalDateTime res1 = now.plusYears(1);
        System.out.println(res1.format(dtf));

        LocalDateTime res2 = now.minusMonths(5);
        System.out.println(res2.format(dtf));

        LocalDateTime res3 = now.plusDays(100);
        System.out.println(res3.format(dtf));

        //시작일
        LocalDateTime startTime = LocalDateTime.of(2024,6,3,0,0,0);
        //종료일
        LocalDateTime endTime = LocalDateTime.of(2024,12,13,0,0,0);

        //isAfter  : 이후 날짜인지  T/F
        //isBefore : 이전 날짜인지 T/F
        //isEqual  : 동일한 날짜인지 T/F
        //until : 주어진 날짜의 차이를 리턴
        long remainDay = now.until(endTime, ChronoUnit.DAYS);


        if(startTime.isBefore(endTime)){
            System.out.println("진행중입니다.");
        }

        //교육 일수 주말 공휴일  133일 실제 날짜는 193



        System.out.println(remainDay);

    }
}
