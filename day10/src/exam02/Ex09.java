package exam02;

import java.io.IOException;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("두 수를 입력하세요:");
            String line = sc.nextLine();
            if(line.equals("q")) break;
            String[] lines = line.split("\\s+"); //한 개 이상의 공백으로 분할하기
            System.out.printf("두 수의 합: %d%n",
                    Integer.parseInt(lines[0])+Integer.parseInt(lines[1]));
        }
    }
}
