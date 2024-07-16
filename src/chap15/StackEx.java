package chap15;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Coin> stack = new Stack<Coin>();

        //동전 넣기
        stack.push(new Coin(100));
        stack.push(new Coin(500));
        stack.push(new Coin(100));
        stack.push(new Coin(50));

        //동전 꺼내기
        while (!stack.isEmpty()){
            Coin coin = stack.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");

        }



    }
}
