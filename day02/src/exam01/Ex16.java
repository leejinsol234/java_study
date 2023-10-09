package exam01;

public class Ex16 {
    public static void main(String[] args) {
        //중첩 반복문으로 구구단 출력하기
        for(int i=2; i<=9; i++){
            System.out.printf("-----%d단-----%n",i);
            for(int j=1; j<=9; j++){
                System.out.printf("%d X %d = %d%n",i,j,(i*j));
            }
        }
    }
}
