package p_mission;

public class m_06 {
    /*
    문항6.
    문자열 나누기

    문제 설명
    문자열 s가 입력되었을 때 다음 규칙을 따라서 이 문자열을 여러 문자열로 분해하려고 합니다.

       - 먼저 첫 글자를 읽습니다. 이 글자를 x라고 합시다.
       - 이제 이 문자열을 왼쪽에서 오른쪽으로 읽어나가면서, x와 x가 아닌 다른 글자들이 나온 횟수를 각각 셉니다. 처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을 분리합니다.
       - s에서 분리한 문자열을 빼고 남은 부분에 대해서 이 과정을 반복합니다. 남은 부분이 없다면 종료합니다.
       - 만약 두 횟수가 다른 상태에서 더 이상 읽을 글자가 없다면, 역시 지금까지 읽은 문자열을 분리하고, 종료합니다.

     문자열 s가 매개변수로 주어질 때, 위 과정과 같이 문자열들로 분해하고, 분해한 문자열의 개수를 return 하는 함수를 완성하세요.


    제한사항
       - 1 ≤ s의 길이 ≤ 10,000
       - s는 영어 소문자로만 이루어져 있습니다.

    입출력 예
         s                    result
    "banana"                  3
    "abracadabra"           6
    "aaabbaccccabba"   3


    입출력 예 설명
    입출력 예 #1
    s="banana"인 경우 ba - na - na와 같이 분해됩니다.

    입출력 예 #2
    s="abracadabra"인 경우 ab - ra - ca - da - br - a와 같이 분해됩니다.

    입출력 예 #3
    s="aaabbaccccabba"인 경우 aaabbacc - ccab - ba와 같이 분해됩니다.
    */

    public static void main(String[] args) {

        String s = "banana";

        int seperated = 0; //분리된 문자열의 개수

        while(s.length() != 0){ //문자열 s의 길이가 0이 될 때까지(더 이상 읽을 글자가 없을 때까지) 반복한다.

            seperated++; //잘린 문자열의 개수 1씩 증가

            char x = s.charAt(0); //첫 번째 글자
            int same = 1; //x와 같은 문자인 횟수(제일 첫 번째 글자는 비교 기준이므로)
            int diff = 0; //x와 다른 문자인 횟수

            for(int i=1; i<s.length(); i++){
                if(x == s.charAt(i)) //첫 번째 글자와 문자열 s를 한 글자씩 비교해서 같으면
                    same++; //same을 1씩 증가시키고
                else diff++; //다르면 diff를 1씩 증가시킨다.

            if(same == diff) //두 횟수가 같아지면 멈추고
                    break;
            }
            s = s.substring(same + diff); //읽어들인(비교를 마친) 문자열 인덱스에서 자르기
        }
        System.out.println(seperated);
    }
}
