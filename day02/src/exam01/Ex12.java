package exam01;

public class Ex12 {
    public static void main(String[] args) {
        int rank = 4;

        switch (rank){
            case 1:
                System.out.println("금메달");
                break;
            case 2:
                System.out.println("은메달");
                break;
            case 3:
                System.out.println("동메달");
                break;
            default:
                System.out.println("입상");
        }
        //case 값에는 정수만 들어갈 수 있다.('A'와 같은 문자 자료형도 기본 자료형(숫자를 저장하는 자료형)이므로 가능함
    }
}
