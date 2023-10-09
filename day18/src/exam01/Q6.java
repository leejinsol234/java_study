package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        String[] strs1 = splitStr("banana");
        System.out.printf("s : %s, result: %d%n", Arrays.toString(strs1), strs1.length);

        String[] strs2 = splitStr("abracadabra");
        System.out.printf("s : %s, result: %d%n", Arrays.toString(strs2), strs2.length);

        String[] strs3 = splitStr("aaabbaccccabba");
        System.out.printf("s : %s, result: %d%n", Arrays.toString(strs3), strs3.length);
    }

    public static String[] splitStr(String str) {
        System.out.println(str);
        List<String> splitStrs = new ArrayList<>();
        while(!str.isEmpty()) {
            char x = str.charAt(0); // 첫 글자 가져오기
            int cntX = 1; // x 글자가 나오는 갯수 (첫 글자는 정해져 있으므로 1부터 시작)
            int cntY = 0; // x가 아닌 글자가 나오는 갯수
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == x) {
                    cntX++;
                } else {
                    cntY++;
                }
                if (cntX == cntY) { // x 글자의 갯수와 x가 아닌 글자의 갯수가 같아지는 시점에서 분리
                    splitStrs.add(str.substring(0, i+1)); // 분리되는 시점의 문자열 저장
                    str = str.substring(i + 1); // 앞문자열은 분리하고 나머지에서 다시 시작(잘라진 앞 부분은 제외시켜서 담기)
                    break;
                }
            }

            if (cntX != cntY) { // 더이상 x와 x가 아닌 글자의 갯수가 같아지는 지점이 없다면 멈추기
                splitStrs.add(str);
                break;
            }
        }

        return splitStrs.stream().toArray(String[]::new);
    }
}