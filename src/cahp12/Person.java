package cahp12;

public record Person (String name, int age) {
    //DTO Data Transfer Object
    //데이터 전달을 위한 Object
    //로직을 가지지 않는 순수한 데이터 객체 (Getter/Setter 메소드를 가짐)


//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}
