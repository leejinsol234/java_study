package exam02;

import java.io.*;

public class Ex06 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        try(FileInputStream fis = new FileInputStream("specs.zip");
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream("copied2.zip");
            BufferedOutputStream bos = new BufferedOutputStream(fos)){

            while (bis.available()>0){
                bos.write(bis.read());
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.printf("걸린 시간: %d%n", end-start); //893 (약 0.9초)
    }
}
