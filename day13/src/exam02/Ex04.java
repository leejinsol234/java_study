package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        char[] stars = new char[10];
        //배열에 요소 채우기
        Arrays.fill(stars,'*');
        System.out.println(Arrays.toString(stars));

        //두 배열의 요소가 서로 달라지는 index 조회하기
        int[] nums1 = {1,2,3,4,5,6,7,8,9};
        int[] nums2 = {1,2,3,5,6,7,8,9,10};
        int pos = Arrays.mismatch(nums1,nums2);
        System.out.println(pos);

        //불변적인 배열이므로 수정 불가
        List<String> fruits = Arrays.asList("Apple","Orange","Melon");
        System.out.println(fruits);
    }
}
