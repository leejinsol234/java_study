package exam01;

public class Ex07 {
    public static void main(String[] args) {
        // 0 ~ 1
        // 실수가 정수보다 숫자를 더 많이 표현할 수 있다.

        long num = 10000000000L;
        double num2 = num;
        float num3 = num; // 작은 자료형 -> 큰 자료형 / 덜 정밀한 자료형->정밀한 자료형

        byte num4 = 100;
        int num5 = 200;
        int result = num4+num5; //byte가 int로 바뀌어야 오류가 발생하지 않으므로 자동 형변환이 이루어진다.
        System.out.println(result);
    }
}
