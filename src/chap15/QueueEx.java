package chap15;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        //Queue 컬렉션 생성
        Queue<Message> mq = new LinkedList<>();

        //메세지 넣기
        mq.offer(new Message("sendMail", "홍길동"));
        mq.offer(new Message("sendSMS", "신용권"));
        mq.offer(new Message("sendKatalk", "김자바"));

        //메시지를 하나씩 꺼내서 처리
        while (!mq.isEmpty()) {
            Message msg = mq.poll();

            switch (msg.command){
                case "sendMail":
                    System.out.println(msg.to + " 님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(msg.to + " 님에게 문자를 보냅니다.");
                    break;
                case "sendKatalk":
                    System.out.println(msg.to + " 님에게 카톡을 보냅니다.");
                    break;
            }

        }



    }
}
