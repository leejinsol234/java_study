package exam03;

public class Ex02 {
    public static void main(String[] args) {
        // MyLambda my = s-> System.out.println(s);
        // 매개변수가 없을 때는 소괄호를 꼭 작성해야한다.
        MyLambda my = ()-> System.out.println("출력!");
    }
}
