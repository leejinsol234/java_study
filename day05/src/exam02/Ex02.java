package exam02;

public class Ex02 {
    public static void main(String[] args) {
        C c = new C(); //-> C->B,A 자동 형변환(다형성)

        A a = c;
        B b = c;
        //출처를 명확하게 알기 때문에 문제가 되지 않음
        //내용만 작아짐

        A ac = new C();
        B bc = new C();


    }
}
