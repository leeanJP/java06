package chap13;

import chap11.Account;

public class Box<T> {
    public T content;
    //T는 아직 결정되지 않은 타입


    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    //Box 내용물이 같은 지 비교
    public Boolean compare(Box<T> other) {
        return content.equals(other.content);
    }




    public static void main(String[] args) {
//        Box box = new Box();
//
//
//        box.content = "account";
//        if(box.content instanceof String){
//            String content = (String) box.content;
//        }else if(box.content instanceof Integer){
//            Integer content = (Integer) box.content;
//        }
        Box<String> box1 = new Box<>();
        Box<String> box2 = new Box<>();
        box1.content = "100";
        box2.content = "100";

        boolean bool = box1.compare(box2);
        System.out.println("result = " + bool);

    }
}
