package p_mission;

import java.util.Arrays;
import java.util.Random;

public class m_02 {
    public static void main(String[] args) {
        //문항2.
        //- 정수로 된 난수 n개 발생 시킵니다.
        //- 발생한 정수를 작은 순서대로 나열 한 후 중간값을 구하시오
        //- n개가 홀수라면 중간값은 1개, 짝수라면 중간값은 2개가 됩니다.

        int n = new Random().nextInt(10)+1; // 1~10 사이의 정수인 난수 발생
        System.out.println(n);

        // 난수 생성 및 배열에 저장
        int[] rndArray = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            rndArray[i] = random.nextInt(100)+1; // 1~100 사이의 정수인 난수 발생
        }

        // 배열을 오름차순으로 정렬
        Arrays.sort(rndArray);

        // 정렬된 배열 확인
        for(int num : rndArray){
            System.out.print(num+" ");
        }

        System.out.println();

        // 중간값을 찾아 반환
        int center = n / 2;
        if (n % 2 == 1) { // 홀수일 경우
            int middle = rndArray[center];
            System.out.println("중간값: " + middle);
        } else { // 짝수일 경우
            int middle1 = rndArray[center - 1];
            int middle2 = rndArray[center];
            System.out.println("중간값 1: " + middle1);
            System.out.println("중간값 2: " + middle2);
        }
    }
}
