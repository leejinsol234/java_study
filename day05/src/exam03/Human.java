package exam03;

public class Human extends Animal{
    @Override //메서드 오버라이드가 되었음을 자바에게 전달해주는 수단
    public void move(){
        System.out.println("두 발로 직립보행한다.");
    }

    public void reading(){
        System.out.println("독서를 한다.");
    }
}
