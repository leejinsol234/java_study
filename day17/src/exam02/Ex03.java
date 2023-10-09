package exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Ex03 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("book.obj"); //기반 스트림
            ObjectOutput oos = new ObjectOutputStream(fos)){ //직렬화하기
            Book book1 = new Book("책1","저자1","출판사1");
            Book book2 = new Book("책2","저자2","출판사2");

            String str = "가나다";

            oos.writeObject(book1);
            oos.writeObject(book2); //인스턴스 변수만 직렬화한다.
            //NotSerializableException -> 보안상 위험성이 있으므로 동의가 필요

            oos.writeObject(str);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
