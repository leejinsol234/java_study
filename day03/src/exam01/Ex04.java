package exam01;

import java.util.stream.IntStream;

public class Ex04 {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40};
        System.out.println(nums.length);

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

        //향상된 for문
        for(int num : nums){
            System.out.println(num);
        }

        //한 줄로 작성하기
        //IntStream.range(0,nums.length).forEach(i -> System.out.println(nums[i]));
    }
}
