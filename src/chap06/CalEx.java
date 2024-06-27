package chap06;

public class CalEx {
    public static void main(String[] args) {

        double resultPi = 10* 10* Cal.pi;

        int resultPlus = Cal.plus1(5 , 10);
        int resultMinus = Cal.minus1(5 , 10);

        System.out.println(resultPi);
        System.out.println(resultPlus);
        System.out.println(resultMinus);
        System.out.println(Cal.company);
        System.out.println(Cal.info);
        //int testResult = Cal.plus(10,5);

        Cal myCal = new Cal();

        int res1 = myCal.plus(3, 4); //7
        double res2 = myCal.devide(10 ,5 );

        System.out.println(res1);
        System.out.println(res2);

        double res3 = myCal.areaRectangle(10);
        double res4 = myCal.areaRectangle(10 ,20);

        System.out.println(res3);
        System.out.println(res4);

    }
}
