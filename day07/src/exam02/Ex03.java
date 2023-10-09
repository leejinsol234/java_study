package exam02;

public class Ex03 {
    public static void main(String[] args) {
        //NPE: Null Pointer Exception
        try {
            int num1 = 10;
            int num2 = 2;
            int num3 = num1 / num2; //던져지는 시점
            System.out.println(num3); //ArithmeticException

            String str = null;
            System.out.println(str.toUpperCase()); //NullPointerException
        } catch (ArithmeticException | NullPointerException e){ //받는 시점. 받는 시점 이후로는 코드 실행X
                                    //|로 같이 작성 가능
            System.out.println(e.getMessage());
        } //catch (NullPointerException e){ //건너뛰지 않도록 catch로 str을 받는다.
            //System.out.println(e.getMessage());
        //} catch (Exception e){ //다형성에 의해서 상위 클래스인 Exception으로 사용할 수 있다. //
            //상위 클래스에서 이미 다 처리했는데 하위 클래스에서 처리할 것이 없으므로 가장 상위 클래스이므로 항상 마지막에 작성해야 한다.
            //System.out.println(e.getMessage());

        System.out.println("중요한 코드");
        }

    }

