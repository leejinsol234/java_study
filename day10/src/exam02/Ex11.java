package exam02;

import java.util.StringTokenizer;

public class Ex11 {
    public static void main(String[] args) {
        String str = "Apple,Orange#Melon+Banana";

        StringTokenizer st = new StringTokenizer(str, ",#+"); //구분이 되는 문자
        while (st.hasMoreTokens()){ //다음 토큰이 있을 때까지
            String fruit = st.nextToken();
            System.out.println(fruit);
        }

    }
}
