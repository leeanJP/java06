package chap13;

public class Course {
    //모든 사람이면 등록 가능
    public static void regCourse1(Applicant<?> applicant){
        System.out.println(applicant.Kind.getClass().getSimpleName() +
                "이/가 Course 1을 등록함" );
    }

    //학생만 등록가능
    public static void regCourse2(Applicant<? extends Student> applicant){
        System.out.println(applicant.Kind.getClass().getSimpleName() +
                "이/가 Course 2을 등록함" );
    }
    //직장인 및 일반인만 등록 가능
    public static void regCourse3(Applicant<? super Worker> applicant){
        System.out.println(applicant.Kind.getClass().getSimpleName() +
                "이/가 Course 3을 등록함" );
    }
}
