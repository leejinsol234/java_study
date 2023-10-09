package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Transportation trans = Transportation.BUS;
        switch(trans){
            case BUS: //switch문에서는 자료형을 명시하지 않고 상수명만 작성한다.
                System.out.println("버스");
                break;
            case SUBWAY:
                System.out.println("지하철");
                break;
            case TAXI:
                System.out.println("택시");
                break;
        }
        /*if(trans == Transportation.BUS){
            System.out.println("버스!");
        }
        */
    }
}
