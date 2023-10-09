package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Ex06 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","melon","orange");
//        fruits.replaceAll(new UnaryOperator<String>() {
//            @Override
//            public String apply(String s) {
//                return s.toUpperCase();
//            }
//        });
        //lambda로 작성하기
        fruits.replaceAll(s->s.toUpperCase());

        //메서드 참조로 작성하기
        //fruits.replaceAll(String::toUpperCase);

        System.out.println(fruits);
    }
}
