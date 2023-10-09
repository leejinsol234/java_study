package exam01;

public class Ex13 {
    public static void main(String[] args) {
        int num = 1, total=0; //같은 자료형 일 때는 여러 개의 변수를 한 번에 선언할 수 있다.
        //초기값(int num=1)과 조건식(int num=100), 증감식(num++)이 이 있어야 횟수를 통제할 수 있으므로 반드시 필요하다.
        while (num <= 100){ //조건이 false면 실행 코드 수행하지 않음
            total += num;
            num++;
        }
        System.out.println(total);
    }
}
