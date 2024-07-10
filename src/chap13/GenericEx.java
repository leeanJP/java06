package chap13;

public class GenericEx {
    public static void main(String[] args) {
        //Box<String> box = new Box<String>();
        Box<String> box = new Box<>();
        box.content = "안녕";

        String str = box.content;
        System.out.println(str);

        Box<Integer> box1 = new Box<>();
        box1.content = 10;
        int value = box1.content;
        System.out.println(value);

    }
}
