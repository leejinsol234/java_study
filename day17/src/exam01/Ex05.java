package exam01;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("data.dat");
            DataOutputStream dos = new DataOutputStream(fos)){ //보조 스트림
            dos.writeInt(100);
            dos.writeBoolean(true);
            dos.writeUTF("안녕하세요.");
            //기본형 그대로 파일 작성. 데이터는 만들어진 순서대로 할당받는다.
            //같은 자료형끼리 작성하는 것을 권장.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
