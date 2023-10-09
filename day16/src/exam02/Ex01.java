package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("test1.txt")){
            int ch = fis.read(); //1바이트를 읽어오고 커서가 이동. 원래 바이트의 범위는 -127~126이지만
            // 여기서 char은 unsigned byte(양의 정수 0~255)인데 -1이 필요(더 이상 읽을 값이 없음을 알려주는 반환값)하므로 효율적으로 int를 사용함.
            System.out.println((char)ch); // int로 출력하면 65가 출력됨. char형으로 출력하면 A

            ch = fis.read();
            System.out.println((char)ch); //B

            ch = fis.read();
            System.out.println((char)ch); //C

            ch = fis.read();
            System.out.println((char)ch); //D

            ch = fis.read();
            System.out.println(ch); //-1 -> 더 이상 읽을 값이 없을 경우

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
