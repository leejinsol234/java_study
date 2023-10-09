package p_mission;

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

    public static String[] splitStr(String str){

        System.out.println(str);

        List<String> splitStrs = new ArrayList<>();

        while (!str.isEmpty()){
            char x = str.charAt(0);
            int cntX = 1;
            int cntY = 0;

            for(int i=1; i<str.length(); i++){
                if(str.charAt(i)==x){
                    cntX++;
                } else {
                    cntY++;
                }

                if(cntX == cntY) {
                    splitStrs.add(str.substring(0,i+1));
                    str = str.substring(i+1);
                    break;
                }
            }
            if(cntX != cntY){
                splitStrs.add(str);
                break;
            }
        }

        return splitStrs.toArray(String[]::new);
    }
}
