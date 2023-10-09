package exam01;

public class Ex02 {
    public static void main(String[] args) {
        
        int num3 =30;
        
        Calculator cal = new Calculator() { //실행과정 중에 메서드 재정의
            @Override
            public int add(int num1, int num2) {
                //num3 = 40;
                return num1 + num2 + num3; //지역 변수의 상수화
            }
        };
        //Calculator cal = (a,b) -> a + b; 람다식
        int result = cal.add(10,20);
        System.out.println(result);
    }
}
