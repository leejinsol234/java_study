package exam02;

import java.util.Arrays;
import java.util.Comparator;

public class Ex05 {
    public static void main(String[] args) {
        //오름차순 정렬하여 조회하기
        String[] names = {"이름1","이름5","이름3","이름4","이름2"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        Arrays.sort(names, Comparator.reverseOrder()); //내림차순으로 조회
        System.out.println(Arrays.toString(names));
    }
}
