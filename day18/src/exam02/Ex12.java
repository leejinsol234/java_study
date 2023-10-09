package exam02;

import java.time.Instant;

public class Ex12 {
    public static void main(String[] args) {
        Instant date1 = Instant.now();
        System.out.println(date1); //UTC+0 기준 -> 2023-10-04T08:16:26.358407800Z
        long time = date1.toEpochMilli(); //System.currentTimeMillis()
        System.out.println(time);

        long time2 = date1.getEpochSecond(); //timeStamp
        System.out.println(time2);
    }
}
