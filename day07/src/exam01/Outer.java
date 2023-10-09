package exam01;

public class Outer {

    public Calculator cal = new Calculator() { //멤버 변수일 때
        public int add(int num1, int num2){
            return num1 + num2;
        }
    };
    Calculator method(int num3){ //final int num3
        return new Calculator() { //메서드 내부(지역): 실행 중에는 객체가 생성될 수 있다.
        // Calculator cal = new Calculator()
                  //cal은 지역변수(stack에 존재). new Calculator()은 heap에 존재.
                  //return new Calculator() 익명함수

            public int add(int num1, int num2) {
                //num3 = 40; 불가능
                return num1 + num2 + num3;
                                    //지역변수(num3)를 객체 안에서 사용할 경우 상수가 되어 데이터영역에 유지됨
                                    //지역변수의 상수화
            }
        };

//        int result = cal.add(10,20);
//        System.out.println(result);
        //System.out.println(System.identityHashCode(cal));
        //return cal;
    }

    /*
    void method(){
        class Inner{ //지역 내부 클래스
            void method(){
                System.out.println("지역 내부 클래스!");
            }
        }
        //용도가 제한적이므로 이렇게는 자주 사용하지 않음

        Inner in = new Inner();
        in.method();
    }

     */
}
