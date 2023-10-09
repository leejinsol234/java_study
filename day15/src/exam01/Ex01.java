package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);

        Stream<Integer> stm = nums.stream().map(x -> x*x).filter(x -> x % 2==0);
                                          //map(x -> x*x)중간연산.filter(x -> x % 2==0)중간연산.toList()최종연산
                                          //반환값이 stream이 아닌 연산(최종연산)으로 끝나야 연산이 완료되어 값을 출력할 수 있다 .
        List<Integer> nums2 = stm.toList();
        System.out.println(nums2);
    }
}
