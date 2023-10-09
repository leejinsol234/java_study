package exam07;

public class Ex01 {
    public static void main(String[] args) {
        Outer out = new Outer(); // 외부 클래스가 객체로 만들어지는 것이 전제 조건
        Outer.Inner in = out.new Inner();
        in.method();
    }
}
