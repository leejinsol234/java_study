package exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {
    public static void main(String[] args) throws IOException {
        System.out.print("아무 문자 입력: ");
//        char ch = (char)System.in.read();
//        System.out.println(ch);
        InputStreamReader isr = new InputStreamReader(System.in); //바이트 단위를 문자 단위로 변환
        //Reader isr = new InputStreamReader(System.in);
        //문자 단위로 입력할 수 있음
//        char ch = (char)isr.read();
//        System.out.println(ch);
        //buffer까지 추가하는 것이 일반적
        BufferedReader br = new BufferedReader(isr);
        //BufferedReader br = new BufferedReader(new InputStream(System.in)); -> Scanner로 대체할 수 있음
        String line = br.readLine();
        System.out.println(line);
        //문장 단위로 읽기
    }
}
