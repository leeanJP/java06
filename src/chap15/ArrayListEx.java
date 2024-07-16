package chap15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        //ArrayList 컬렉션 생성

        List<Board> list = new ArrayList<>();

        //객체 추가
        list.add(new Board("제목1", "내용1", "작성자1"));
        list.add(new Board("제목2", "내용2", "작성자2"));
        list.add(new Board("제목3", "내용3", "작성자3"));
        list.add(new Board("제목4", "내용4", "작성자4"));

        //저장된 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체 수 : " + size);


        //특정 인덱스 객체 가져오기
        Board board = list.get(3);
        System.out.println(board.getSubject() + "\t" + board.getContent());

        for(int i = 0; i < list.size(); i++) {
            board = list.get(i);
            System.out.println(board.getSubject() + "\t" + board.getContent());
        }

        list.remove(1);
        list.remove(1);

        size = list.size();
        System.out.println("현재 list의 객체 수 : " + size);
        System.out.println("=============");
        for(Board b : list){
            System.out.println(b.getSubject() + "\t" + b.getContent());
        }

    }
}
