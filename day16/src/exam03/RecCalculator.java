package exam03;

public class RecCalculator implements Calculator{

    @Override
    public long factorial(long num) {
        //long start = System.nanoTime();
        //try {
        if(num<1)
            return 1;
        return num*factorial(num-1);
        //} finally { //return이후에 실행되도록 try-catch문안에 넣어서 작성
            //long end = System.nanoTime();
            //System.out.printf("Rec 걸린 시간: %d%n",end-start);
        }
    }

