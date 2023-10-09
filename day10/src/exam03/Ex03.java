package exam03;

public class Ex03 {
    public static void main(String[] args) {
        String str = "BUS";
//        Transportation bus = Enum.valueOf(Transportation.class, str); //Enum 클래스에 정의되어 있는 static valueOf
//        System.out.println(bus);
        Transportation bus = Transportation.valueOf(str); //Transportation에 정의되어 있는 valueOf를 더 자주 사용함.
        System.out.println(bus);
    }
}
