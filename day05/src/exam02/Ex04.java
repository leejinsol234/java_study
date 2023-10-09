package exam02;

public class Ex04 {
    public static void main(String[] args) {
        A ac = new C(); //ac의 본질은 C,B에 포함되어 있으나 A로 한정된다.
        System.out.println(ac instanceof C);//true
        System.out.println(ac instanceof B);//true
        System.out.println(ac instanceof A);//true

        System.out.println(ac instanceof D);//false

    }
}
