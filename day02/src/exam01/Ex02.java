package exam01;

public class Ex02 {
    static int num5;
    static double num6;
    static boolean result;

    public static void main(String[] args) {
        //기본 자료형의 기본값
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(result);


        //명시적 형변환
        int num1 = 10000;
        byte num2 = (byte)num1;
        System.out.println(num2); //16

        double num3 = 100.123;
        int num4 = (int)num3;
        System.out.println(num4); //100
    }
}
