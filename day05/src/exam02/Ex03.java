package exam02;

public class Ex03 {
    public static void main(String[] args) {
        A ac = new C();
        A ad = new D();

        //C c1 = ad; 출처가 다르면 있으므로 담을 수 없다.
        if(ad instanceof C) { //instanceof : 출처를 확인하기
            C c1 = (C)ad; // 명시적 형변환을 통하면 담을 수 있음.
        }
        if(ac instanceof C) {
           C c2 = (C)ac; //출처가 같아도 C라고 명시해주어야 한다.
           System.out.printf("numA=%d, numB=%d, numC=%d%n",c2.numA,c2.numB,c2.numC);
       }

    }
}
