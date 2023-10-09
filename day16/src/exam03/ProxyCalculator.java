package exam03;

public class ProxyCalculator implements Calculator{
    private Calculator calculator; //다형성으로 확장성 보장

    public ProxyCalculator(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public long factorial(long num) {
        //데코레이터 패턴
        long start = System.nanoTime(); //추가 기능
        try {
            long result = calculator.factorial(num); //(핵심기능)Calculator 기능을 대신 수행
            return result;
        } finally {
            long end = System.nanoTime(); //추가 기능
            System.out.printf("걸린 시간: %d%n",end-start);
        }
    }
}
