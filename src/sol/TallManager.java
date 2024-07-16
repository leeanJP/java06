package sol;

import java.util.Scanner;
import java.util.Vector;

public class TallManager {
    public static void main(String[] args) {

        Vector<Double> height = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("2000~2009년까지 1년단위로 키(cm)를 입력");
        System.out.println(">>");
        for(int i=0; i<10; i++){
            double tall = sc.nextDouble();
            height.add(tall);
        }

        double bigDistance = 0.0;
        int year = 0;
        for(int i=0; i<height.size() -1; i++){
            double distance = height.get(i+1) - height.get(i);
            if(bigDistance < distance){
                bigDistance = distance;
                year = i;
            }
        }
        System.out.println("가장 키가 많이 자란 연도는 " + (year + 2000) + "년 " + bigDistance + "cm");
        sc.close();

    }
}
