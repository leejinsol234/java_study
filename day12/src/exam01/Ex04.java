package exam01;

import java.util.Stack;

public class Ex04 {
    public static void main(String[] args) {
        Stack<String> names= new Stack<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");

        System.out.println(names.pop()); //이름3
        System.out.println(names.pop()); //이름2
        System.out.println(names.pop()); //이름1
        // Stack은 LIFO 구조이다.

    }
}
