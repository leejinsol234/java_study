package exam02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        try(FileInputStream fis = new FileInputStream("specs.zip");
            FileOutputStream fos = new FileOutputStream("copied1.zip")){

            while (fis.available()>0){
                fos.write(fis.read());
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.printf("걸린 시간: %d%n", end-start); //2502 (약 2.5초)
    }
}
