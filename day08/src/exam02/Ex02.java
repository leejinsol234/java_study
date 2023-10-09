package exam02;

public class Ex02 {
    public static void main(String[] args) {
//        Object human = new Human();
//        Object tiger = new Tiger();
//        Object bird = new Bird();
        Human human = new Human();
        Tiger tiger = new Tiger();
        Bird bird = new Bird();
        //다형성으로 인해 가능함(모두 java.lang.Object를 상속받았으므로)

        Object[] animals = {human,tiger,bird};

        /*
        Object[] animals = {
                new Human(),
                new Tiger(),
                new Bird()
                };
        */
    }
}
