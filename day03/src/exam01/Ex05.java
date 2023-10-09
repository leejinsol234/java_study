package exam01;

import java.util.Arrays;

public class Ex05 {
    static  String str;

    public static void main(String[] args) {

        /*
        기본 자료형 : 초기값
		정수형 자료형(byte, short, int, long) -> 0
		실수형 자료형(float, double) -> 0.0
		논리형 자료형(boolean) -> false
        */

        int[] nums1 = new int[4];
        System.out.println(Arrays.toString(nums1));

        double[] nums2 = new double[4];
        System.out.println(Arrays.toString(nums2));

        boolean[] bools = new boolean[4];
        System.out.println(Arrays.toString(bools));

        /*
	    참조 자료형
		예) String - 초기값 null
        */
        //System.out.println(str);
        String[] strs = new String[4];
        System.out.println(Arrays.toString(strs));
    }
}
