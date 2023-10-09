package exam01;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        //Map<String,String> members = new HashMap<>();
        //Map<String,String> members = new TreeMap<>(); //오름차순으로 정렬되어 조회됨
        Map<String,String> members = new TreeMap<>(Comparator.reverseOrder()); //내림차순으로 변경하기
        //Map<String,String> members = new TreeMap<>((a,b)->b.compareTo(a)); 람다식으로 표현하기

        members.put("user01","사용자01");
        members.put("user02","사용자02");
        members.put("user03","사용자03");
        members.put("user04","사용자04");
        members.put("user05","사용자05");

        members.put("user03","(수정)사용자03"); //put으로 값 변경하기

        members.remove("user03"); //remove로 제거하기

        String name = members.get("user03"); //key값으로 value값 조회하기 -> 사용자03
        System.out.println(name);
        //System.out.println("user06"); //null
        String name2 = members.getOrDefault("user06","없는 사용자"); //key값이 없을 때 대체 value으로 출력
        System.out.println(name2);

//        Set<Map.Entry<String,String>> entries =  members.entrySet(); //Map에 있는 전체 값 조회
//        for(Map.Entry<String, String> entry : entries){
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.printf("key=%s, value=%s%n",key,value);
//        }


        for(Map.Entry<String, String> entry : members.entrySet()) { //생략해서 작성 가능
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("key=%s, value=%s%n",key,value);
        }
    }
}
