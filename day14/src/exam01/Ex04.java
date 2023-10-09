package exam01;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Ex04 {
    public static void main(String[] args) {
        //매개 변수가 2개, 반환값이 1개 인데 자료형이 모두 동일할 때
        BinaryOperator<Integer> cal = (a,b) -> a+b;
        int result = cal.apply(10,20); //a.intValue()+ b.intValue()
        System.out.println(result);

        //Integer는 wrapper클래스로 unboxing과정에서 a.intValue()+ b.intValue() 이러한 연산 과정이 추가되므로

    }
}
