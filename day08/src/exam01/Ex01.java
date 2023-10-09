package exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {

    public static void main(String[] args) {
        FileInputStream fis = null; //catch문에 접근할 수 있도록
        try {
             fis = new FileInputStream("a.txt");

           // fis.close();//자원 해제 IOException로 처리 - 다형성 적용
        } catch (IOException e){
            e.printStackTrace();
//            try {
//                if(fis != null) fis.close(); //예외가 발생하든 안하든 자원해제가 될 수 있도록
//            } catch (IOException e2){}
        } finally {
            //예외가 발생하든 하지 않든 무조건 실행되는 코드
            try {
                if(fis != null) fis.close(); //코드가 짧을 때는 중괄호 없이 한 줄로 작성 가능
            } catch (IOException e){
                e.printStackTrace();
            }
            System.out.println("자원 해제!");
        }
    }
}
