package exam03;

import java.util.TreeSet;

public class Ex01 {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("이름2");
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름5");
        names.add("이름4");

        System.out.println(names); //[이름1, 이름2, 이름3, 이름4, 이름5] -> 오름차순 정렬

    }
}
