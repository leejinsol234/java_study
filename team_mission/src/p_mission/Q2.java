package p_mission;

import java.util.Random;
import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {

        int n = new Random().nextInt(10)+1;

        int[] rndArray = new int[n];
        Random rnd = new Random();

        for(int i=0; i<n; i++){
            rndArray[i] = rnd.nextInt(100)+1;
        }

        Arrays.sort(rndArray);

        int center = n/2;

        if(n%2==1){
            int middle = rndArray[center];
            System.out.println("중간값: "+middle);
        } else {
            int middle1 = rndArray[center-1];
            int middle2 = rndArray[center];
            System.out.println("중간값1: "+middle1);
            System.out.println("중간값2: "+middle2);
        }

    }
}
