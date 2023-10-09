package exam01;

import java.io.FileWriter;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("text2.txt",true)){ //마지막 커서에 이어서 작성되게 하려면 append에 true값을 준다.
            fw.write("B안녕하세요.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
