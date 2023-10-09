package exam01;

public abstract class Calculator {// 접근제어자 다음에 abstract 작성하는 것이 관례적이다.
                                  // 추상클래스는 설계가 목적이며 설계의 틀을 제공
                                  // 구현되지 않은 메서드가 있어 불완전하므로 객체가 될 수 없다.
    int num = 10;
    public abstract int add(int num1, int num2);
    public abstract int minus(int num1, int num2);

    public void commonMethod(){ // 완전히 구현된 인스턴스 메서드 정의 가능 : 하위 클래스의 공통기능
        System.out.println("공통 메서드");
    }
}
