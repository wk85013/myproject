package guess.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
//        java();
//        java8();
        LocalDateTime enter = LocalDateTime.of(2018, 12, 25, 8, 0, 0);
        LocalDateTime leave = LocalDateTime.of(2018, 12, 25, 10, 2, 0);

        Car car = new Car("AA-0001", enter);//取得某時區的Long時間
        car.setLeave(leave);
        System.out.println(car.getDuration() + "分鐘");
        long hours = (long) Math.ceil(car.getDuration() / 60.0);//無條件進位
        System.out.println(hours);

    }

    private static void java8() {
        Instant instant = Instant.now();
        System.out.println(instant);//格林威治時間
        //local
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);//本地時間
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));//格式化時間
        System.out.println(now.plus(Duration.ofHours(3)));//加3小時
        LocalDateTime other = LocalDateTime.of(2018, 11, 23, 8, 0, 23);//直接定義時間
        System.out.println(other);
    }

    private static void java() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));

        String s = "2018/12/3 08:00:00";
        Date other = null;
        try {
            other = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(other);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH, 9);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 3);//加3天
        System.out.println(calendar.getTime());
    }
}

