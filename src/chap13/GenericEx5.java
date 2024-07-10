package chap13;

import chap06.p1.A;

public class GenericEx5 {
    public static void main(String[] args) {

        //모든 사람이 신청 가능
        Course.regCourse1(new Applicant<Person>(new Person()));
        Course.regCourse1(new Applicant<Worker>(new Worker()));
        Course.regCourse1(new Applicant<Student>(new Student()));
        Course.regCourse1(new Applicant<HighStudent>(new HighStudent()));
        Course.regCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));


        //학생만 신청 가능
//     ㄴ   Course.regCourse2(new Applicant<Worker>(new Worker()));
//        Course.regCourse2(new Applicant<Person>(new Person()));
        Course.regCourse2(new Applicant<Student>(new Student()));
        Course.regCourse2(new Applicant<HighStudent>(new HighStudent()));
        Course.regCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));


        //직장인 및 일반인만 신청 가능
        Course.regCourse3(new Applicant<Person>(new Person()));
        Course.regCourse3(new Applicant<Worker>(new Worker()));
//        Course.regCourse3(new Applicant<Student>(new Student()));
//        Course.regCourse3(new Applicant<HighStudent>(new HighStudent()));
//        Course.regCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
    }
}
