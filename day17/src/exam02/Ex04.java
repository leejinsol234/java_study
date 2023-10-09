package exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Ex04 {
    public static void main(String[] args) throws ClassNotFoundException{ //클래스가 존재하지 않을 경우의 예외처리
        try(FileInputStream fis = new FileInputStream("book.obj");
            ObjectInputStream ois= new ObjectInputStream(fis)){ //역직렬화하기
            Book book1 = (Book) ois.readObject();
            Book book2 = (Book) ois.readObject();

            String str = (String) ois.readObject(); //순서대로 가져오지 않으면 error -> Map 형태가 유용하다. -> Ex05

            System.out.println(book1); //복구에는 인스턴스 변수만 필요하다.
            System.out.println(book2);

            System.out.println(str);
        } catch (IOException e){
            e.printStackTrace();
        }
    } //serialVersionUID->
      // 직렬화 할 때의 상태와 역직렬화(복구)할 때의 상태가 같은지 버전을 비교하여 다르면 역직렬화(복구)되지 않음(보호장치)
      //serialVersionUID 사용자가 직접 관리할 수 있음
}
