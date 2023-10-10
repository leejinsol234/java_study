package exam01;

public class Ex05 {
    public static void main(String[] args) {
         long num = 10000000000L;
         // int -> long
         //자바가 처음에 모든 정수를  int로 인식하기 때문에 오류가 발생하는데 숫자 마지막에 소문자l 또는 대문자 L을 붙여 작성한다.
        byte num2 = 100; // int 100 -> byte 100 순서로 인식하므로
        int num3 = 100; // 처음부터 int로 작성하는 것이 더 효율적이다.

        double num4 = 100.1234;
        float num5 = 100.1234f; //100.1234를 double(8)로 인식 -> float(4) 오류가 발생하므로  마지막에 소문자f 또는 대문자 F을 붙여 작성한다.

        long num6= 10_000_000_000_000L; //, 대신 언더바로 자리수 구분


    }
}
