package exam02;

public class Ex06 {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        System.out.println(i1 == i2);
        System.out.println("i1 주소: "+System.identityHashCode(i1));
        System.out.println("i2 주소: "+System.identityHashCode(i2));
        //i1과 i2는 같은 주소

        //그러나 숫자가 커지면 다른 객체로 만들어짐.
        Integer i3 = Integer.valueOf(100000);
        Integer i4 = Integer.valueOf(100000);
        System.out.println("i3 주소: "+System.identityHashCode(i3));
        System.out.println("i4 주소: "+System.identityHashCode(i4));
    }
}
