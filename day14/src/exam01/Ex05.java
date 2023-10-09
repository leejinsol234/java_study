package exam01;

import java.util.function.IntBinaryOperator;

public class Ex05 {
    public static void main(String[] args) {
        //Integer는 wrapper클래스로 unboxing과정에서 a.intValue()+ b.intValue() 이러한 연산 과정이 추가되므로
        IntBinaryOperator cal = (a,b) -> a+b;
        int result = cal.applyAsInt(10,20);
        System.out.println(result);
    }
}
