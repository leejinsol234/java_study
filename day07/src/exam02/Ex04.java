package exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt");
            //close(); : 자원이 해제됨
            //fis.close(); //IOException 발생
            System.out.println("자원 해제");
        } catch (IOException e) { //다형성으로 인해 상위 클래스인 IOException으로 작성
            e.printStackTrace();
//            try {
//                fis.close();
//            } catch (IOException e2){}
        } finally {
            //예외가 발생하든 안하든 무조건 실행되는 코드
                if(fis != null){
                    try {
                        fis.close();
                    } catch (IOException e){
                        e.printStackTrace();
                    }

                }

            System.out.println("자원 해제");
        }
    }
}
