package exam07;

public class Outer {
    int num1 = 30;
    int num2 = 20;
    static int num;
    class Inner {

        int num1 = 10;
        static int num;
        void method(){
            //System.out.println("인스턴스 내부 클래스");
            System.out.println("Inner_num1: "+num1); //Inner의 num1에 접근
            System.out.println("num2: "+num2);
            System.out.println("Outer_num1:" +Outer.this.num1);//Outer의 num1(인스턴스 자원)에 접근
        }
        static void staticMethod(){
            System.out.println("정적 메서드");
        }
    }
}
