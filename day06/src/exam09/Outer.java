package exam09;

public class Outer {

    int num1 = 10;
    static int num2 = 20;
    static class Inner{ //정적 내부 클래스
        void method(){
            System.out.println("정적 내부 클래스");
            //System.out.println(Outer.this.num1); 인스턴스 자원에는 접근X
            System.out.println(num2); //정적 자원에는 접근 가능

            Outer out = new Outer();
            System.out.println(out.num1); //객체를 생성 후에는 접근할 수 있다.
        }

    }
}
