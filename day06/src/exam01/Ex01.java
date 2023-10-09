package exam01;

public class Ex01 {
    public static void main(String[] args) {
        //Calculator cal = new Calculator();
        //SimpleCalculator cal = new SimpleCalculator();
        Calculator cal = new SimpleCalculator(); // 다형성으로 인해 가능함
        int result = cal.add(10,20);
        System.out.println(result);

        System.out.println(cal.num);

        cal.commonMethod();
    }
}
