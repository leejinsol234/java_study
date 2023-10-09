package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.add(new Apple());
        appleBasket.add(new Apple());

        Juicer.make(appleBasket);

        Basket<Melon> melonBasket = new Basket<>();
        melonBasket.add(new Melon());
        melonBasket.add(new Melon());

        Juicer.make(melonBasket);

        Basket<Toy> toyBasket = new Basket<>();
        toyBasket.add(new Toy());
        toyBasket.add(new Toy());

        //Juicer.make(toyBasket);
        //상한 제한으로 의해 불가능함
    }
}
