package exam02;

import java.util.Arrays;
import java.util.function.Function;

public class Ex03 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "melon", "mango"};
        String[] converted = map(fruits, s -> s.toUpperCase()); //s는 items[i]

        System.out.println(Arrays.toString(converted));
    }

    public static String[] map(String[] items, Function<String,String> func){
        String[] datas = new String[items.length];

        for(int i=0; i<items.length; i++){
            datas[i] = func.apply(items[i]);
            //Stream은 내부 반복만 지원하고 apply는 추상메서드로서 사용자 정의 기능을 수행한다.
        }
        return datas;
    }


}
