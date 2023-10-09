package exam01;

public class Ex04 {
    public static void main(String[] args) {
        String str1 = "가나다";
        String str2 = "가나다"; //리터럴 (문자열)상수이므로(그렇지만 힙에 있음!)
        System.out.println(str1 == str2); //true 그러나 제한적인 상황이 많으므로 equals로 비교해야함!
        System.out.printf("str1 주소: %d, str2 주소: %d%n", System.identityHashCode(str1), System.identityHashCode(str2));

    }
}
