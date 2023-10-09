package exam01;

public class Ex03 {
    public static void main(String[] args) {
        //동일성과 동등성 비교
        int num1 = 10;
        int num2 = 10;
        System.out.println(num1 == num2); //true

        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1 == str2); //false (==: 주소에 대한 비교/JS에서 === 기능)
        System.out.println(str1.equals(str2)); //true
    }
}
