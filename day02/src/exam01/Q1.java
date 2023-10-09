package exam01;

public class Q1 {
    public static void main(String[] args) {
        //1번
        //변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해 보시오
        int num1 = 20;
        double num2 = 3.0;

        int result_a = (int)(num1+num2);
        System.out.println(result_a);

        int result_s = (int)(num1-num2);
        System.out.println(result_s);

        int result_m = (int)(num1*num2);
        System.out.println(result_m);

        int result_d = (int)(num1/num2);
        System.out.println(result_d);
    }
}
