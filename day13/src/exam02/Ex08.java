package exam02;


import java.util.*;

public class Ex08 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(new Random().ints(5).boxed().toList());

        Collections.sort(nums, Comparator.reverseOrder()); //내림차순으로 조열
        System.out.println(nums);
    }
}
