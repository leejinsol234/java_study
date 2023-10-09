package exam03;

public class Box<T extends Fruit & Eatable> { //Fruit의 하위클래스만 T에 들어갈 수 있음(상한 제한) 이 경우 Fruit,Apple, Melon만 들어갈 수 있고 컴파일러는 실행하기 전까지는 Fruit으로 바꿔줌.
    //T는 type 매개변수, 여러 개로 사용할 때는 알파벳 순서대로 U,R...
    private T item;
    //private static T item2; 처음부터 자료형이 명시 되어야 공간을 할당하므로 static은 사용할 수 없음
    //private T[] item3 = new T[3]; new를 통해 만드는 (크기가 정해지지 않은)배열 사용할 수 없음
    private int[] item3 ={1,2,3,4}; //T가 아닌 자료형이 정해진 배열은 가능함. T는 정해지지 않은 대상이므로 불가능!
    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }

    public void printInfo(){
        item.getInfo();
    }

}
