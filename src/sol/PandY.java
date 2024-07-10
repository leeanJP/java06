package sol;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class PandY {
    public static void main(String[] args) {
        boolean answer = true;
        String s = "pPoooyY";
        int countP = 0;
        int countY = 0;
        int a = 5;
        int b = 24;
        LocalDate date = LocalDate.of(2016,a,b);
        date.getDayOfWeek();

        char[] char_arr = new char[s.length()];
        char_arr = s.toCharArray();
        for(char c : char_arr){
            if(Character.toLowerCase(c) == 'p'){
                countP++;
            }else if(Character.toLowerCase(c) == 'y'){
                countY++;
            }
        }

        if(countP == countY){
            answer = true;
        }else {
            answer = false;
        }

        System.out.println("p" + countP);
        System.out.println("y" + countY);
        System.out.println(answer);
    }



}
