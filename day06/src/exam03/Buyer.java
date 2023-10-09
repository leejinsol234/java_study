package exam03;

public interface Buyer {
    void buy();

    default void order(){ // public

        System.out.println("Buyer 주문!");
        privateMethod();// private 메서드는 내부에서만 사용할 목적
    }

    public static void staticMethod(){

        System.out.println("정적 메서드");
    }

    private void privateMethod(){ //Java 9버전부터 private 사용 가능
        System.out.println("Private 메서드");
    }

}
