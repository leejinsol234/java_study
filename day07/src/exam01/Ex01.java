package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Calculator cal = out.method(30);
        //System.out.println(System.identityHashCode(cal));
        int result = cal.add(10,20);
        System.out.println(result);
    }
}
