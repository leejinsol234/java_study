package exam03;

public class ImplCalculator implements Calculator{
    @Override
    public long factorial(long num) {
        //long start = System.nanoTime();
        //try {
            long total = 1L;
            for (long i = 1L; i <= num; i++) {
                total *= i;
            }
            return total;
        //} finally { //return이후에 실행되도록 try-catch문안에 넣어서 작성
            //long end = System.nanoTime();
            //System.out.printf("Impl 걸린 시간: %d%n",end-start);
        }

    }

