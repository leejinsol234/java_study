package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(); //<>안에 받으려고 하는 자료형(타입 매개변수)을 작성
        //원래 Object였다가 객체가 만들어지는 시점에 Apple로 바뀜
        appleBox.setItem(new Apple());
        //appleBox.setItem(new Melon()); //오류. 타입 안정성 확보
        Apple apple = appleBox.getItem(); //<>안에 자료형을 명시함으로써 형변환의 번거로움 해결

        //Box<Toy> toyBox= new Box<Toy>(); Fruit의 하위 클래스가 아니므로
        //Type parameter 'exam03.Toy' is not within its bound; should extend 'exam03.Fruit'

        //Box<Melon> melonBox = new Box<Melon>();
        //Type parameter 'exam03.Melon' is not within its bound; should implement 'exam03.Eatable'




    }
}
