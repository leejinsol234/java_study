package exam01;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("test1.txt")){ //자동해제 기능 포함되어 있음
            fos.write('안');
            fos.write('녕');
            fos.write('하');
            fos.write('세');
            fos.write('요');
            fos.write('.');

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}