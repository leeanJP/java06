package chap13;

public class FruitBox<T> {
    //모든 클래스 타입을 받기 위해서 Object 타입으로 설정함.
    private  T[] fruit;

    public FruitBox(T[] fruit) {
        this.fruit = fruit;
    }

    public T getFruit(int index) {
        return fruit[index];
    }



    public static void main(String[] args) {
        Apple[] arr = {
                new Apple(),
                new Apple()
        };

        FruitBox<Apple> box = new FruitBox<>(arr);
        Apple apple1 = (Apple) box.getFruit(0);
        //Object 타입으로 선언시에는 캐스팅을 해줘야하지만
        Apple apple2 = box.getFruit(1);
        //제네릭을 사용하면 캐스팅을 안해도 오류가 없다.

        //Banana banana = (Banana) box.getFruit(1);
    }
}

class Apple{}
class Banana{}