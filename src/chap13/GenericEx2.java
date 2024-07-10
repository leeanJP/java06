package chap13;

public class GenericEx2 {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();
        //K 는 TV로 대체 , M 은 String으로 대체
        product1.setKind(new Tv());
        product1.setModel("스마트 TV");

        Tv tv = product1.getKind();
        String model = product1.getModel();

        //=======================================

        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("SUV");

        Car car = product2.getKind();
        String model2 = product2.getModel();

    }
}
