package chap07;

public class ComputerEx {
    public static void main(String[] args) {
        int r = 10;

        Cal cal = new Cal();
        System.out.println("원 면적 : " + cal.areaCircle(r));

        Computer com = new Computer();
        System.out.println("원 면적 : " + com.areaCircle(r));

    }
}
