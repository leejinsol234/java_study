package exam02;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Ex06 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        //LocalDate date2 = date1.plus(100, ChronoUnit.DAYS); //100일 후
        LocalDate date2 = date1.plusDays(100);
        System.out.println(date2);

        //LocalDate date3 = date2.minus(30,ChronoUnit.MONTHS); //30개월 전
        LocalDate date3 = date2.minusMonths(30);
        System.out.println(date3);

    }
}
