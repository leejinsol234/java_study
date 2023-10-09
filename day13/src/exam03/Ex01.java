package exam03;

public class Ex01 {
    public static void main(String[] args) {
//        Calculator cal = new Calculator() {
//            @Override
//            public int add(int num1, int num2) {
//                return num1+num2;
//            }
//        };

         //lambda식으로 쓰기
        Calculator cal = (a,b)-> a + b;
        //interface 정의를 통해 알 수 있는 요소들(자료형,반환값,변수명)은 용도가 제한적이므로 생략 또는 대체 가능
        //int result = cal2.add(10,20);
        //System.out.println(result);
        calc(cal);
        calc((a,b)-> a + b);
    }

    public static void calc(Calculator cal){
        int result = cal.add(10,20);
        System.out.println(result);
    }
}
