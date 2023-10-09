package exam01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex06 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("data.dat");
            DataInputStream dis = new DataInputStream(fis)) {
            int num = dis.readInt();
            boolean result = dis.readBoolean();
            String str = dis.readUTF();
            //순서를 바꾸면 안되고 만들어진 자료형 그대로 읽어와야 한다.
            System.out.printf("num=%d, result=%s, str=%s%n",num,result,str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
