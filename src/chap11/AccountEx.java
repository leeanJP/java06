package chap11;

import chap06.p1.A;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account();

        //예금 하기
        account.deposit(10000);
        System.out.println("예금액 : " + account.getBalance());

        //출금하기
        try {
            account.withdraw(30000);
        } catch (InsuffiecientException e) {
            String msg = e.getMessage();
            System.out.println(msg);
        }
    }
}
