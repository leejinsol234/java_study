package exam01;

public class Ex14 {
    public static void main(String[] args) {
        int num = 1, total = 0;

        do{ //조건식의 참, 거짓과 상관 없이 한 번은 무조건 실행된다.
            total += num;
            num++;
        } while(num<=100);
        System.out.println(total);
    }
}
