package exam02;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int[] nums1 = {10,20,30,50};
        int[] nums2 = {10,20,30,40};

        System.out.println(Arrays.equals(nums1,nums2));

        //for문으로 구현하는 방법도 있으나 비효율적이다.
        boolean isSame = true;
        for(int i=0; i<nums1.length; i++){
            if(nums1[i] != nums2[i]){
                isSame =false;
                break;
            }
        }
        System.out.println(isSame);
    }
}
