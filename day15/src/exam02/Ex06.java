package exam02;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        int[] scores = {50,40,70,88,100,33};
        /*int max = Arrays.stream(scores).reduce(Integer.MIN_VALUE, (acc,i)-> {

            System.out.printf("acc=%d, i=%d%n",acc,i);

            if(acc > i) //둘 중 더 큰 값을 반환
                return acc;
            else
                return i;
        });
        */

        //최대값 구하기
        int max = Arrays.stream(scores).reduce(Integer.MIN_VALUE, (a,b)-> a>b ? a : b);
        System.out.println(max);

        //최소값 구하기
        int min = Arrays.stream(scores).reduce(Integer.MAX_VALUE, (a,b)-> a>b ? b : a); //Integer.MAX_VALUE 최대값을 시작값으로 지정함.
        System.out.println(min);

        int min2 = Arrays.stream(scores).reduce((a,b)-> a>b? b:a).getAsInt(); //지정한 시작값이 없음
        System.out.println(min2);
    }
}
