package exam02;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ex13 {
    public static void main(String[] args) {
        //Duration
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime before = now.minusDays(500);
        Duration du = Duration.between(before,now);
        long sec = du.getSeconds();
        //System.out.println(sec);
        //현재 시간을 0년, 1월 1일, 0:0:0로 변경 + sec
        LocalDateTime date1 = LocalDateTime.of(0,1,1,0,0,0).plusSeconds(sec);
        System.out.println(date1); //1년 5개월 15일

    }
}
