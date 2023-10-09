package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
    /*public static void main(String[] args) { //try-with-resources문(자동으로 자원 해제됨)
        try (FileInputStream fis = new FileInputStream("a.txt")){

        } catch (IOException e){
            e.printStackTrace();
        }
    }
*/
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        try (fis) {
        }
    }
}
