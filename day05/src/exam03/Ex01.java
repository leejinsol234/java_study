package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Animal human = new Human(); //Human,Animal
        human.move();

        Animal bird = new Bird(); //Bird, Animal
        bird.move();

        Animal tiger = new Tiger(); //Tiger,Animal
        tiger.move();
        //다형성으로 공통적인 자료형으로 묶으면 배열로 사용할 수 있다.
    }
}
