package exam01;

import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex11 {
    public static void main(String[] args) {
//        String[] strs = Stream.of("가","나","다").toArray(new IntFunction<String[]>() {
//            @Override
//            public String[] apply(int value) { //int value: 요소의 개수
//                return new String[value];
//            }
//        });

        //String[] strs = Stream.of("가","나","다").toArray(i -> new String[i]);
        String[] strs = Stream.of("가","나","다").toArray(String[]::new);
        System.out.println(Arrays.toString(strs));

    }
}