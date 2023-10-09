package exam01;

import java.util.function.*;


public class Ex10 {
    public static void main(String[] args) {
        //메서드 참조
        Consumer<String> func1 = System.out::println; // s-> Sytem.out.println(s)를 메서드 참조로 작성하기
        func1.accept("가나다");

        //UnaryOperator<String> func2 = s -> s.toUpperCase();
        UnaryOperator<String> func2 = String::toUpperCase;
        System.out.println(func2.apply("abc"));

        //BiPredicate<String,String> func3 = (s1, s2) -> s1.equals(s2);
        BiPredicate<String,String> func3 = String::equals;
        System.out.println(func3.test("가나다","가나다"));

        BiPredicate<String,String> func4 = (s1, s2) -> s2.equals(s1); //매개변수의 순서가 동일하지 않으면 메서드 참조로 작성할 수 없음.


    }
}
