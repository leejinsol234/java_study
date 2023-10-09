package exam03;

public class Ex05 {
    public static void main(String[] args) {
        String str0 ="ABC";
        String str1 = new String("ABC");
        String str2 = new String("ABC");
        //str0,1,2 모두 주소가 다른 객체

        System.out.printf("str1==str2: %s%n", str1==str2); //false 주소 비교
        System.out.printf("str1.eqauls(str2): %s%n",str1.equals(str2)); //true

        System.out.println("str0: "+ System.identityHashCode(str0));
        System.out.println("str1: "+ System.identityHashCode(str1));
        System.out.println("str2: "+ System.identityHashCode(str2));
    }
}
