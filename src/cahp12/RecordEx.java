package cahp12;

public class RecordEx {
    public static void main(String[] args) {

        Member2 m = new Member2("winter" , "눈송이", 20);
        //getter 메소드가 호출된다.
        System.out.println(m.age());
        System.out.println(m.id());
        System.out.println(m.name());
        System.out.println(m.toString());

        Member2 m1 = new Member2("winter", "눈송이", 20);
        Member2 m2 = new Member2("winter", "눈송이", 20);
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m1.equals(m2));

    }




}
