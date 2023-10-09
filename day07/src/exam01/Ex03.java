package exam01;

public class Ex03 {
    public static void main(String[] args) {
        A a = new A(){ //실행과정 중에 메서드 재정의 가능
            public void method(){
                System.out.println("수정한 메서드!");
            }
        };

        a.method();
    }
}
