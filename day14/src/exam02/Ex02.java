package exam02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> stm = nums.stream(); //stream은 1회용 객체이다. 한 번 사용 되면 더이상 사용 할 수 없음.
        //int result = stm.mapToInt(x -> x * x).filter(x -> x % 2 == 1).sum();
        IntStream stmt = stm.mapToInt(x -> x * x).filter(x -> x % 2 == 1); //중간 연산
        int result = stmt.sum(); //최종 연산
        //중간 연산은 최종 연산이 호출되기 전에는 연산되지 않음 -> 지연된 연산
        System.out.println(result);
        //System.out.println(nums);
        //가공해도 데이터는 그대로이다. Stream은 원 데이터를 복사해서 사용한다.

        //int result2 = stm.mapToInt(x -> x * x * x).sum(); //error

    }
}
