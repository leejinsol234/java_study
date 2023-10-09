package exam03;

public class Ex03 {
    public static void main(String[] args) {
        Human human = new Human();
        human.move(); //자신의 클래스에 정의된 자원을 먼저 사용한다.(자신의 클래스에 없을 경우에 상위 클래스의 자원을 사용)
    }
}
