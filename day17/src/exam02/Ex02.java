package exam02;

import java.io.File;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        //File dir = new File("D:/uploads/folder1/folder2/folder3/folder4");
        File dir = new File("D:/uploads/folder1/folder2/../../folder3/folder4"); // ../ -> 상위 폴더 이동
        File file = new File(dir,"test2.txt");
        if(!dir.exists()){ //경로가 존재하지 않을 때
            //dir.mkdir(); //한 개의 폴더를 만들 때
            dir.mkdirs(); //중첩되는 폴더를 만들 때
        }

        //File file = new File("D:/uploads/folder1/test.txt");
        file.createNewFile();
        //존재하지 않는 폴더에 파일 만들기 -> error, 지정된 경로를 찾을 수 없습니다

        System.out.println(file.getAbsolutePath()); //상대 경로가 그대로 노출됨(D:uploads\folder1\folder2\..\..\folder3\folder4\test2.txt)
        System.out.println(file.getCanonicalPath()); //정규화된 경로로 출력(D:uploads\folder3\folder4\test2.txt)
    }
}
