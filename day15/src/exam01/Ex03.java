package exam01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;

public class Ex03 {
    public static void main(String[] args) {
        int[] scores = {90,88,55,68,73,100};

        IntSummaryStatistics stat = Arrays.stream(scores).summaryStatistics();
        System.out.printf("과목 수: %d, 점수 합계: %d, 평균: %.2f, 최고점수: %d, 최저점수: %d%n", stat.getCount(), stat.getSum(), stat.getAverage(),stat.getMax(),stat.getMin());

        int[] scores2 = Arrays.stream(scores).boxed().sorted(Comparator.reverseOrder()).mapToInt(x -> x).toArray();
        //Stream의 메서드를 사용하려고 할 때 boxed()를 통해서 기본 자료형을 일반 스트림(Stream<Integer>)으로 변환하여 sorted(Comparator.reverseOrder())를 사용할 수 있도록 한다.
        System.out.println(Arrays.toString(scores2));

    }
}
