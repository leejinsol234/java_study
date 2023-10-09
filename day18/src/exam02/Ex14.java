package exam02;

import java.time.LocalDate;
import java.time.Period;

public class Ex14 {
    public static void main(String[] args) {
        //Period
        LocalDate now = LocalDate.now();
        LocalDate before = now.minusDays(976);
        Period pr = Period.between(before,now);

        int year = pr.getYears();
        int month = pr.getMonths();
        int day = pr.getDays();

        System.out.printf("year=%d, month=%d, day=%d",year,month,day);
        //System.out.println(pr); //P2Y8M4D -> 2년 8개월 4일

    }
}
