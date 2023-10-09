package p_mission;
import static java.lang.Math.*;

public class study04Math {
    public static void main(String[] args) {
//        System.out.println("절대값(abs()): "+ Math.abs(-10));
//        System.out.println("반올림(round()): "+ Math.round(10.678));
//        System.out.println("반올림(round()) - 소수점 두 번째 자리에서: "+ Math.round(10.678*10)/10.0);
//        //10으로 나누면 정수로 반환하기 때문에 10.0으로 나누어야 소수점 첫 번째 자리까지 반환한다.
//        System.out.println("올림(ceil()): "+ Math.ceil(10.23));
//        System.out.println("버림(floor)): "+ Math.floor(10.6));
//        System.out.println("2의 3승(pow)): "+ Math.pow(2,3));

        System.out.println("절대값(abs()): "+ abs(-10));
        System.out.println("반올림(round()): "+ round(10.678));
        System.out.println("반올림(round()) - 소수점 두 번째 자리에서: "+ round(10.678*10)/10.0);
        //10으로 나누면 정수로 반환하기 때문에 10.0으로 나누어야 소수점 첫 번째 자리까지 반환한다.
        System.out.println("올림(ceil()): "+ ceil(10.23));
        System.out.println("버림(floor)): "+ floor(10.6));
        System.out.println("2의 3승(pow)): "+ pow(2,3));
    }
}
