package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int c = 30;
        Calculator cal  = (a,b) ->{
            //c = 40; 지역 변수의 상수화로 인해 변경 불가
            return a + b + c;
        };
        int result = cal.add(10,20);
        System.out.println(result); //60
    }
}
