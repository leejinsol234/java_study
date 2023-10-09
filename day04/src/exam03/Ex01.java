package exam03;

public class Ex01 {
    public static void main(String[] args) {
        A a = new A(); //동일패키지 exam03 안에 있으므로 접근 가능
        System.out.println(a.num1);
        //a.num3

        a.print();
        System.out.println(a.num4); //동일 패키지

    }
}
