package p_mission;

import java.util.Objects;

public class study04Arrays {
    public static void main(String[] args) {

        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1,2,3,4,5};

        /*
        boolean isSame = true;
        try {
            for (int i = 0; i < nums1.length; i++) {
                if (nums2[i] != nums1[i]) {
                    isSame = false;
                    break;
                }
            }
        } catch (Exception e){
            isSame = false;
        }
        */

        //배열 비교하기 deepEquals
        boolean isSame = Objects.deepEquals(nums1,nums2);
        System.out.println(isSame); //true
    }
}
