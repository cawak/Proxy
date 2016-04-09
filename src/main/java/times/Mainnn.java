package times;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.locks.LockSupport;

/**
 * Created by kaga on 2/24/16.
 */
public class Mainnn {
    volatile static int x = 2;
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm'Z'");
        String time1 = LocalDateTime.now().format(formatter);
        System.out.println(time1);

        String time = LocalDateTime.now(ZoneId.of("UTC")).format(formatter);
        System.out.println(time);
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(time);
        x++;
        System.out.println(offsetDateTime);

        System.out.println(Double.isFinite(1.01));
        System.out.println(x);
        java.util.concurrent.locks.LockSupport.park();
        LockSupport.getBlocker(Thread.currentThread());
    }
}
