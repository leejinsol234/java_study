package exam02;

public class Ex02 {
    public static void main(String[] args) {
        try { //예외가 발생할 수 있는 코드
            int num1 = 10;
            int num2 = 0;
            int num3 = num1 / num2; //ArithmeticException발생 //throw new ArithmeticException...
            System.out.println(num3);
        } catch (ArithmeticException e){//e는 던져진 객체

            //String message = e.getMessage(); //예외 발생 시 처리할 코드
            //System.out.println(message);
            e.printStackTrace();
        }

        System.out.println("아주 중요한 소스 코드. 실행 안되면 절대 안됨!");
    }
}
