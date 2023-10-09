package exam02;

import exam03.A;

public class Ex02 {
    public static void main(String[] args) {
        A a = new A(); //다른 패키지(exam02)에 있는 클래스를 사용하려면 import
        //a.num1;
        System.out.println(a.num2);
        a.print();
        //a.num4;//상속을 통해서만 접근이 가능함

        B b = new B();
        b.print2();

    }
}
