package exam01;

import java.util.Vector;

public class Ex02 {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>(3);
        System.out.println("capacity:"+ names.capacity()); //capacity(): 배열에 남아있는 공간
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        System.out.println("capacity:"+ names.capacity()); //배열이 한 번 더
        names.add("이름4");
        System.out.println("capacity:"+ names.capacity()); //공간을 두 배로 늘려서 다시 만듦
    }
}
