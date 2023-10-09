package exam01;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex02 {
    public static void main(String[] args) {
        String[] fruites = {"Apple","Orange","Melon"};

        //배열 요소들을 문자열 Apple,Orange,Melon으로 출력하기
        String str = Arrays.stream(fruites).collect(Collectors.joining(",")); //자주 쓰임
        System.out.println(str);
    }
}
