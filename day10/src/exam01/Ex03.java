package exam01;

public class Ex03 {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(System.identityHashCode(str)); //1915910607
        str += "DEF";
        System.out.println(System.identityHashCode(str)); //1313922862
        str += "GHI";
        System.out.println(System.identityHashCode(str)); //495053715
        //기존 객체를 버리고 다시 만드므로 주소가 바뀜
        //버려진 객체는 GC가 삭제해줌
        //매번 객체를 새로 만들어야 하므로 성능이 저하될 수 있음.

        System.out.println(str);
    }
}
