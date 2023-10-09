package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        //int num2 = i1 + 20; 객체 간의 연산은 불가능하지만
        int num2 = i1.intValue() + 20; // 자동으로 i1.intValue()가 호출되고 20이 더해진다. (1.5버전부터)
        // -> Integer 안에서 intValue를 통해서 int로 꺼내줌 -> Unboxing
        System.out.println(num2);

    }
}
