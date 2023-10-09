package exam02;

public class Ex02 {
    public static void main(String[] args) {
        //main함수가 제일 먼저 실행됨

        int num1=10;
        int num2=20;
        int result = add(num1,num2); //이름이 같아도 활성화되는 지역이 다르므로 다른 변수이다.
        //int result = add(10,20);
        //System.out.println(result);
    }

    static int add(int num1, int num2){//함수 코드. 호출되었을 때 메모리를 할당 받는다.
        //반환값의 자료형 함수명(매개변수)

        //함수 지역
        int result = num1 + num2;

        return result;
    }
}
