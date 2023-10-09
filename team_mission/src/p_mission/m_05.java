package p_mission;


public class m_05 {
    /*
    문항5.
    Earth-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다.
    알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다.
    spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1, 존재하지 않는다면 2를 return하도록 완성하세요.

    제한사항
    - spell과 dic의 원소는 알파벳 소문자로만 이루어져있습니다.
    - 2 ≤ spell의 크기 ≤ 10
    - spell의 원소의 길이는 1입니다
    - 1 ≤ dic의 크기 ≤ 10
    - 1 ≤ dic의 원소의 길이 ≤ 10
    - spell의 원소를 모두 사용해 단어를 만들어야 합니다.
    - spell의 원소를 모두 사용해 만들 수 있는 단어는 dic에 두 개 이상 존재하지 않습니다.
    - dic과 spell 모두 중복된 원소를 갖지 않습니다.
    */
    public static void main(String[] args) {
        String[] spell = {"s", "o", "m", "d"};
        String[] dic = {"moos", "dzx", "smm", "sunmmo", "som"};

        int isExist = 2; // spell의 알파벳을 한 번씩 모두 사용한 단어가 존재하지 않을 경우 값으로 초기화

        for(String dicE : dic){ // dic의 단어들을 하나씩 비교하기
            boolean check = true; // 확인을 위한 논리값
            for(String spellE : spell){ // spell의 알파벳 하나씩과 비교하기
                if(dicE.indexOf(spellE) == -1){
                    // 비교대상인 dic의 단어.indexOf(비교기준인 spell의 알파벳들) spell의 알파벳들이 dic의 단어에 없으면
                    check = false; // 논리값에 false를 대입하고
                    break; // 빠져나감
                }
            }

            if(check){ // check가 true면
               isExist = 1; //spell의 알파벳을 한 번씩 모두 사용한 단어가 존재할 경우의 반환값 1을 대입
               break;
            }
        }
        System.out.println(isExist);
    }
}
