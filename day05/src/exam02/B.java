package exam02;

import org.w3c.dom.ls.LSOutput;

public class B extends A {
    int numB = 20;

    public B(){
        super(); //A클래스의 기본 생성자가 호출됨 -> A();
        System.out.println("B 생성자!");
    }

}
