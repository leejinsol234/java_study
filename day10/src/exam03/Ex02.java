package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Transportation trans = Transportation.BUS;
        //상수 하나 하나가 Transportation Enum 클래스의 객체이다.
        System.out.printf("trans.ordinal(): %d, trans.name(): %s%n",trans.ordinal(),trans.name());
    }
}
