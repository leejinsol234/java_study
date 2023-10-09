package exam02;

public interface Calculator {

    int num = 10; //public static final (정적 상수) static이므로 객체가 되지 않아도 접근 가능
    int add(int num1, int num2); // 설계가 목적이므로 추상 메서드만 정의하도록 되어있다.(abstract 작성하지 않아도 됨)
                                 // public abstract 자동 추가
}
