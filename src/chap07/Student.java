package chap07;

public final class Student extends Person {
    public int s_no;

    public Student(String name, int s_no){
        super(name);
        this.s_no = s_no;
    }

    public void study(){
        System.out.println("공부함");
    }
}
