package chap13;

public class GenericEx4 {
    //제네릭 메소드

    public static <T> Box<T> boxing(T t){
        Box<T> box = new Box<>();
        box.setContent(t);
        return box;

    }

    public static void main(String[] args) {
        //제네릭 메소드 호출
        Box<Integer> box1 = boxing(100);
        int i = box1.getContent();
        System.out.println(i);


        Box<String> box2 = boxing("Hello");
        String s = box2.getContent();
        System.out.println(s);

    }
}
