package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Calculator cal1 = new ProxyCalculator(new ImplCalculator()); //(핵심기능) 외부에서 주입받아 대신 수행
        long result1 = cal1.factorial(10L);
        System.out.println("cal1: "+ result1);

        Calculator cal2 = new ProxyCalculator(new RecCalculator());
        long result2 = cal2.factorial(10L);
        System.out.println("cal2: "+result2);
    }

}
