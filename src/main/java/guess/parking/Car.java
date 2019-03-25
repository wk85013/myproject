package guess.parking;


import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id = "";
    private LocalDateTime enter;
    private LocalDateTime leave;

    public Car(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }

    public void leave() {
        leave = LocalDateTime.now();
    }

    void setLeave(LocalDateTime leave) {
        if (leave.isAfter(enter)) {
            this.leave = leave;
        }
    }

    public long getDuration() {
        Duration duration = Duration.between(enter,leave);//時間差
        return duration.toMinutes();//時間差(分鐘數)

    }
}
