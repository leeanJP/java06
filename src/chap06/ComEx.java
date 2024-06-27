package chap06;

public class ComEx {
    public static void main(String[] args) {

        Computer myCom = new Computer();
        int res1 = myCom.sum(1,2,3,4,5);

        int[] values = {1,2,3,4,5,6,7};
        int res2 = myCom.sum(values);

        int res3 = myCom.sum(new int[]{1,2,3,4,5,6,7});
    }
}
