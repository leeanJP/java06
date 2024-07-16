package sol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TravelManager {
    public static void main(String[] args) {
        ArrayList<Location> travel = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //시작위치
        travel.add(new Location(0,0));
        System.out.println("쥐가 이동한 위치 (x,y)를 5개 입력하라.");

        for(int i= 0; i<5 ; i++){
            System.out.println(">>");
            int x = sc.nextInt();
            int y = sc.nextInt();
            travel.add(new Location(x,6));
        }
        //최종위치
        travel.add(new Location(0,0));

        double sum = 0;
        for(int i=0 ; i<travel.size()-1; i++){
            //i , i+1 사이의 이동거리
            double d = travel.get(i).distance(travel.get(i+1));
            sum += d;
        }

        System.out.println("총 이동거리는 " + sum);
        sc.close();

    }
}


class Location {
    private int x, y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Location b){
        return Math.sqrt(Math.pow(b.x - x, 2) + Math.pow(b.y - y, 2));
    }

}