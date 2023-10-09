package exam01;

import java.io.IOException;
import java.io.PrintStream;

public class Ex03 {
    public static void main(String[] args) {
        try(PrintStream ps = new PrintStream("test3.txt")){
            ps.println("반갑");
            ps.println("습니다.");
            ps.printf("%s님 안녕하세요!%n","이이름");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
