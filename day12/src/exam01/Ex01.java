package exam01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(); //다형성
        //List<String> names = new LinkedList<>();
        names.add("이름2");
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5"); //names에 값 추가하기

        LinkedList<String> names2 = new LinkedList<>(names);

//        for(int i=0; i<names.size(); i++){
//            names.remove(i);
//        }

        //모두 제거되지 않는 이유는 삭제될 때마다 공간의 크기가 바뀌면 배열이 새롭게 만들어지면서 이미 삭제가 끝난 index에 들어간 값은 삭제되지 않는다.
        //그러므로 순서 변동 없이 삭제하려면 마지막 index부터 삭제한다.

//        for(int i=names.size()-1; i>=0; i--){
//            names.remove(i);
//        }
        //stack구조(LIFO)에 최적화된 구조

        for(int i=0; i<names.size(); i++){
            String name = names.get(i);
            System.out.println(name);
        }



    }
}
