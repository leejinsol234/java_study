package exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex04 {
    public static void main(String[] args) {
        int[] nums = IntStream.iterate(0,x-> x+2).limit(10).toArray();
        System.out.println(Arrays.toString(nums));

        nums[0]=1;
        boolean result = Arrays.stream(nums).allMatch(x-> x%2 == 0); //전체가 참일 때만 참
        System.out.println(result); //false

        boolean result2 = Arrays.stream(nums).anyMatch(x -> x%2 ==0); //한 개라도 참이면 참
        System.out.println(result2); //true

        int num = Arrays.stream(nums).filter(x -> x%2 == 0).findFirst().getAsInt(); //첫 번째로 찾은 요소 반환
        System.out.println(num);

    }
}
