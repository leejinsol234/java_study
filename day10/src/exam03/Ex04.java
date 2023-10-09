package exam03;
import static exam03.Transportation.*;
public class Ex04 {
    public static void main(String[] args) {
        //Transportation trans = new Transpotation(); //private으로 만들어졌으므로 만들 수 없다.
        //Transportation trans = Transportation.BUS;
        Transportation trans = BUS; //import static exam03.Transportation.*;를 통해 간단하게 작성 가능
        System.out.println(trans.getTitle());
        System.out.println(trans.getTotal(10));
    }
}
