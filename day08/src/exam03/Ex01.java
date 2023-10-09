package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Book b1 = new Book("책1","저자1","출판사1");
        System.out.println(b1);
        //toString()이 자동으로 호출 Object::toString();
        //System.out.println(b1.toString());

    }
}
