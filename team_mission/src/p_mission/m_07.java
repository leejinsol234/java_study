package p_mission;

public class m_07 {
    public static void main(String[] args) {
//        int[] lottos = {31,0,44,1,0,25};
//        int[] win_nums = {31,10,45,1,6,19};

//        int[] lottos = {0,0,0,0,0,0};
//        int[] win_nums = {38,19,20,40,15,25};

        int[] lottos = {45,4,35,20,3,9};
        int[] win_nums = {20,9,3,45,4,35};

        int[] answer = new int[2]; //당첨 가능한 최고 순위와 최저 순위를 담을 배열
        int same = 0; //민수의 번호와 1등 번호가 몇 개 일치하는지 담을 변수
        int zero = 0; //민수 번호 중 낙서때문에 알아볼 수 없어서 0으로 취급하는 번호의 개수
        int[] rank = {6,6,5,4,3,2,1};
                    //0,1개 일치하면 6등

        for(int i : lottos){
            if(i == 0){ //알아볼 수 없는 번호일 때
                zero++;
            } else {
                for(int j : win_nums){
                    if(i == j){ //민수의 번호와 1등 번호가 일치할 때
                        same++;
                        break;
                    }
                }
            }
        }

        answer[0] = rank[same+zero]; //최고 순위
        answer[1] = rank[same]; //최저 순위

        System.out.printf("최고 순위: %d, 최저 순위: %d",answer[0],answer[1]);
    }
}
