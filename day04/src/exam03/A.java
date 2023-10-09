package exam03;

public class A {
    int num1 = 10; //default
    public int num2 = 20;
    private int num3 = 30;

    protected int num4 = 40;

    public void print(){
        System.out.println(num3);
    }

    // void print(){
    //        System.out.println(num3);// private은 클래스내부에서만 접근 가능
    //    }

}
