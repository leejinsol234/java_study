package exam01;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        //선언과 동시에 초기화하기
        int[][] nums = {{10, 20, 30}, {40, 50, 60}};
        System.out.println(nums.length); //2개의 행(0,1). 행의 개수
        System.out.println(nums[0].length); //3개의 열(0,1,2). 열의 개수

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.printf("%d행, %d열 = %d%n",i,j,nums[i][j]);
            }
        }
    }
}
