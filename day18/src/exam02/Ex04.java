package exam02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex04 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        DayOfWeek dayOfWeek = date1.getDayOfWeek(); // 1(월)~7(일)
        int yoil = dayOfWeek.getValue();
        System.out.println(yoil);

        String yoilStr1 = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.ENGLISH); //짧게
        String yoilStr2 = dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.ENGLISH); //가장 짧게
        String yoilStr3 = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        System.out.printf("SHORT=%s, NARROW=%s, FULL=%s",yoilStr1,yoilStr2,yoilStr3);
    }
}
