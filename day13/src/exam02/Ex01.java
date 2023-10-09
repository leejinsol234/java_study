package exam02;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40};
        System.out.println(nums); //주소값 출력 [I@723279cf
        System.out.println(Arrays.toString(nums)); //[10, 20, 30, 40]

        int[][] nums2 = {{10,20,30,40},{50,60,70,80}};
        System.out.println(nums2); //다차원 배열의 주소값 [[I@10f87f48
        System.out.println(Arrays.toString(nums2)); //다차원 배열 안의 배열 하나씩 주소값 출력 [[I@b4c966a, [I@2f4d3709]
        System.out.println(Arrays.deepToString(nums2)); //[[10, 20, 30, 40], [50, 60, 70, 80]]
    }
}
