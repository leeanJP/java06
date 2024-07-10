package chap13;

public class Applicant<T> {
    public  T Kind;

    public Applicant(T kind) {
        this.Kind = kind;
    }
}
