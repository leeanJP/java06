package chap06;

public class Cal {

    static double pi = 3.14159;
    static String company = "LG";
    static String info;

    static int plus1(int x , int y){
        return x+y;
    }

    static int minus1(int x , int y){
        return x-y;
    }

    int plus(int x , int y) {
        return x+y;
    }
    int plus(int x , int y, int z) {
        return x + y + z;
    }
    double plus(double x , double y) {
        return x+y;
    }

    double devide(int x , int y) {
        double result = (double) x/ (double) y;
        return result;
    }

    //사각형의 넓이 구하는 계산기
    //정사각형 넓이 구하기
    double areaRectangle(double width){
        return width*width;
    }
    //직사각형 넓이 구하기
    double areaRectangle(double width, double height){
        return width*height;
    }


    //Static 블록
    static {
        info = company;
    }
}
