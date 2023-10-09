package exam03;

@FunctionalInterface
//함수형 인터페이스이므로 하나의 기능만 정의할 수 있게 알려주는 annotation
public interface Calculator {
    int add(int num1, int num2);
    //int minus(int num1, int num2); //함수는 단일 기능만 수행해야 한다.
}
