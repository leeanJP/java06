package sol;

import java.util.Scanner;

class Rect {
    private int width , height;
    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return width * height;
    }
}

public class RectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rect[] rArr = new Rect[4];

        for(int i = 0; i < rArr.length; i++){
            System.out.print(i+1);
            System.out.println(" 너비와 높이 >> ");
            int width = sc.nextInt();
            int height = sc.nextInt();
            rArr[i] = new Rect(width, height);
        }

        System.out.println("저장 하였습니다.");
        int sum = 0 ;
        for(int i = 0; i < rArr.length; i++){
            sum += rArr[i].getArea();
        }
        System.out.println("사각형 전체의 합은 " + sum);
        sc.close();
    }

}
