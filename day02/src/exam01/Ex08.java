package exam01;

public class Ex08 {
    public static void main(String[] args) {
        //단락회로 평가
        int num1 = 10;
        boolean result = num1++ > 9 || (num1= num1+10)>30;
        System.out.println(result);
        System.out.println(num1); //11
    }
}
