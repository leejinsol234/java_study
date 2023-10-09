package exam02;

import java.util.Objects;

public class Ex07 {
    public static void main(String[] args) {
        String str = null;
        str = Objects.requireNonNullElse(str,"abc"); //str이 null이면 defaultObj를 기본값으로
        System.out.println(str.toUpperCase());
    }
}
