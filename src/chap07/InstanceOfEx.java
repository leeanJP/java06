package chap07;

public class InstanceOfEx {
    //main 메소드에서 바로 호출하기 위해 정적 메소드 선언
    public static void personInfo(Person person){
        System.out.println("name : " + person.name );
        person.walk();

        //person이 참조하는 객체가 Student 타입인지 확인
        //java 12버전 이전
//        if(person instanceof Student){
//            //Student 객체일경우 강제 타입변환
//            Student student = (Student) person;
//            System.out.println("student No : " + student.s_no);
//            student.study();
//        }
        //java 12버전 이후
        if(person instanceof Student student){
            System.out.println("student No : " + student.s_no);
            student.study();
        }
    }

    public static void main(String[] args) {
        //Person 객체를 매개값으로 제공 personInfo 메소드 호출
        Person p1 = new Person("홍길동");
        personInfo(p1);

        //Student 객체를 매개값으로 제공 personInfo 메소드 호출
        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }

}
