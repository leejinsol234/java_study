package exam02;

import java.util.Optional;

public class Ex01 {
    public static void main(String[] args) {
        //String str = "가나다";
        String str = null;
        //Optional<String> opt = Optional.of(str); //NullPointerException

        //String str2 = opt.get();
        //System.out.println(str2);


        Optional<String> opt = Optional.ofNullable(str); //t가 null이어도 오류 발생 X
        //String str2 = opt.get(); //NoSuchElementException -> get()은 값이 있어야 하는 메서드
        String str2 = opt.orElse("기본값");
        System.out.println(str2);



    }
}
