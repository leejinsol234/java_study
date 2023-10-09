package exam02;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        String[] strs = {"AA","BB","AA","CC","BB","DD","AAA","BBB","CCC"};
        Arrays.stream(strs).distinct().filter(s -> s.length()<3).forEach(System.out::println);
                            //중간연산. 중간연산                   .최종연산

    }
}
