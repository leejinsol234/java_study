package exam01;

public class Ex04 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(System.identityHashCode(sb)); //1915910607
        sb.append("ABC");
        System.out.println(System.identityHashCode(sb)); //1915910607
        sb.append("DEF");
        System.out.println(System.identityHashCode(sb)); //1915910607
        sb.append("GHI");
        System.out.println(System.identityHashCode(sb)); //1915910607
        //모두 같은 주소이다

        String str = sb.toString();
        System.out.println(str);
        System.out.println(System.identityHashCode(str)); //284720968
        //str은 새로 만들어진 문자열 객체이므로 주소가 다르다.
        System.out.println(str == "ABCDEFGHI"); //false
        System.out.println(str.equals("ABCDEFGHI")); //true

    }
}
