package exam02;

public class C extends B {
    int numC = 30;

    public C(){
        super(); //B()가 호출됨 (상위 클래스의 생성자)
        System.out.println("C 생성자!");
    }
}
