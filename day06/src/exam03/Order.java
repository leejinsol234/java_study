package exam03;

public class Order implements Buyer, Seller{

    @Override
    public void buy() { //instance method
        System.out.println("구매!");
    }

    @Override
    public void order() {
        //Seller.super.order(); //출처의 모호함 제거
        System.out.println("주문");
    }

    @Override
    public void sell() { //instance method
        System.out.println("판매!");
    }
}
