package exam02;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        int[][] nums1 = {{10,20,30},{40,50,60}};
        int[][] nums2 = {{10,20,30},{40,50,60}};

        //다차원 배열의 비교 deepEquals
        System.out.println(Arrays.deepEquals(nums1,nums2));
    }
}
