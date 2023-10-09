package exam02;

public class Ex04 {
    public static void main(String[] args) {
        Schedule2 s1 = new Schedule2(2023,9,8);//생성자의 매개변수에 값을 넣어서
//        s1.setYear(2023);
//        s1.setMonth(9);
//        s1.setDay(8);

        System.out.println("s1: "+s1); //s1.toString()
        System.out.println("s1주소: " + System.identityHashCode(s1));

        s1.printThis();
    }
}
