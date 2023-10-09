package exam02;

import java.io.File;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) throws IOException,InterruptedException{
//        File file = new File("D:/uploads/test.txt");
//        file.createNewFile();
        File dir = new File("D:/uploads");
        File file = File.createTempFile("tmp",".log",dir); //지정한 경로 dir에 만들기
        String path = file.getAbsolutePath();
        System.out.println(path);
        //file.delete(); //생성 후 바로 삭제됨
        file.deleteOnExit(); //어플리케이션 종료 후 바로 삭제

        Thread.sleep(5000); //5초 후에 삭제되도록
        System.out.println("종료!");

    }
}
