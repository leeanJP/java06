package cahp12;

public class Student {
    //객체 해시코드
    //객체를 식별하는 정수
    //Object 의 hashCode 메소드는 객체의 메모리 번지를 이용해서 해시코드를 생성
    //객체가 동일한지 비교할 때 주로 사용

    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }
//
//    @Override
//    public int hashCode() {
//        int hashCode = no + name.hashCode();
//
//        return hashCode;
//    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student target){
            if(no == target.getNo() && name.equals(target.getName())){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Student s1 = new Student(1,"홍길동");
        Student s2 = new Student(1,"홍길동");
        System.out.println(s1.toString());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        if(s1.hashCode() == s2.hashCode()){ //해시코드가 동일한지 검사
            if(s1.equals(s2)){ // 데이터가 동일한지 검사
                System.out.println("동등 객체");
            }else  {
                System.out.println("데이터가 다르므로 동등객체 X");
            }
        }else {
            System.out.println("해시코드가 다르므로 동등 객체 X");
        }
    }
}
