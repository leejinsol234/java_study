package p_mission;

public class m_03 {
    public static void main(String[] args) {
        //문항3.
        // - 건물에서 30m 떨어진 지점에서 건물의 꼭대기를 올려본 각을 측정해보니 45°였다고 한다.
        // - 관측자의 눈 높이는 지상으로부터 1.6m 떨어져 있다고 한다.
        // - 건물의 높이를 구하시오.
        //
        //참고)
        //수학관련 함수는 java.lang.Math 클래스를 활용할 것

        double width = 30.0; //건물과 관측자 사이의 거리
        double eye = 1.6; // 관측자의 눈 높이
        double angle = 45.0; // 관측자가 건물 꼭대기를 올려본 각도

        // tan(각도) = 높이/거리
        // 높이 = tan(45)*30

        double radian = Math.toRadians(angle);
        // Java의 Math클래스가 라디안 단위로 작동하므로 라디안으로 변환
        // 참고) 라디안은 원주 위의 호의 길이가 반지름과 같은 원의 호를 나타내는 단위이다.
        //      1라디안은 반지름의 길이만큼 호의 길이를 나타내며 따라서 라디안은 각도를 길이로 나타내는 방법이다.
        //      삼각함수는 라디안 단위의 각도를 입력받으므로 주어진 각도를 라디안으로 변환하여 사용해야 한다.

        // 건물의 높이

        double height = Math.tan(radian) * width + eye;

        System.out.printf("건물의 높이는 약 %.2f m입니다.",height);
        //%.2f : 소수점 두 번째 자리까지 반올림한 값
    }






}
