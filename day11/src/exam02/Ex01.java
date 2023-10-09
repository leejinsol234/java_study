package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.setItem(new Apple()); //Object item = new Apple() -> 다형성
        Apple apple = (Apple) appleBox.getItem(); //제네릭 클래스 사용 이유(1)형변환의 번거로움

        Box melonBox = new Box();
        melonBox.setItem(new Melon()); //Object item = new Melon()
        Object obj = melonBox.getItem();
        if(obj instanceof Apple) {//제네릭 클래스 사용 이유(2)타입 안전성이 떨어짐 ->출처 체크(instanceof)로 타입 안정성 확보
           Apple melon = (Apple) obj;
        }
    }
}
