package p_mission;

import java.util.Random;

public class study04Random {
    public static void main(String[] args) {
        Random rand = new Random();
        /*
        int num1 = rand.nextInt();
        int num2 = rand.nextInt();
        //호출할 때마다 정수 범위 안에서 난수가 발생함
        System.out.println("num1: "+ num1);
        System.out.println("num2: "+ num2);
        */

        rand.ints().limit(6).forEach(System.out::println);
        System.out.println();
        //정렬된 출력값으로 보기
        rand.ints().limit(6).boxed().sorted().forEach(System.out::println);
    }
}
