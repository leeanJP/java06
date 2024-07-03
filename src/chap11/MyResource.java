package chap11;

public class MyResource implements AutoCloseable {

    private String name;

    public MyResource(String name){
        this.name = name;
        System.out.println("My Resource " + name + " 열기");
    }

    public String read1(){
        System.out.println("My Resource  " + name + " 읽기");
        return  "100";
    }
    public String read2(){
        System.out.println("My Resource  " + name + " 읽기");
        return  "abc";
    }



    @Override
    public void close() throws Exception {
        System.out.println("My Resource  " + name + " 닫기");

    }
}
