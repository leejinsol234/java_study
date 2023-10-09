package p_mission;

public class m_04 {
    public static void main(String[] args) {
        /*
        * 문항4.
        - A 자동차와 B자동차는 서로 같은 도착 지점을 향해 가고 있습니다.
        - A 자동차는 최초 60km/h속도로 이동하다가 한시간마다 10km/h씩 속력을 높이고 있고
        - B 자동차는 최초 40km의 속도로 이동하다가 한시간마다 15km/h씩 속력을 높이고 있습니다.
        - A 자동차와 B 자동차가 최초로 만나는 지점(km)를 구하시오.
        */

        int speedA = 60; // A자동차의 처음 속력
        int speedB = 40; // B자동차의 처음 속력
        int plusA = 10; // A자동차의 증가 속력
        int plusB = 15; // B자동차의 증가 속력

        // 속도가 처음 갱신되기 전까지 두 자동차가 이동한 거리
        int positionA = 60;
        int positionB = 40;

        while(positionA != positionB){
            // 한 시간마다 증가하는 속력 갱신
            speedA += plusA;
            speedB += plusB;

            // 두 자동차의 이동 거리
            positionA += speedA;
            positionB += speedB;
        }
        System.out.printf("두 자동차는 %d km 지점에서 만난다.",positionA);
    }
}
