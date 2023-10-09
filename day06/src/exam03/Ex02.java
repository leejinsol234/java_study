package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Order order = new Order();
        order.order(); //Buyer의 default메서드인 order

        Buyer.staticMethod();
    }
}
