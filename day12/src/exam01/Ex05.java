package exam01;

import java.util.LinkedList;
import java.util.Queue;

public class Ex05 {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();
        names.offer("이름1");
        names.offer("이름2");
        names.offer("이름3");

//        System.out.println(names.poll()); //이름1
//        System.out.println(names.poll()); //이름2
//        System.out.println(names.poll()); //이름3
        // Queue는 FIFO 구조이다.

        while (names.size()>0){
            System.out.println(names.poll());
        }
    }
}
