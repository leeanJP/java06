package chap07;

public class Computer extends Cal{

    @Override
    public double areaCircle(double radius) {
        System.out.println("Computer 객체의 areaCircle 실행");
        return Math.PI * radius * radius;
    }

}
