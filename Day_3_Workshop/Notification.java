package Day_3_Workshop;

import java.time.LocalDateTime;

public abstract class Notification {
    String message;
    LocalDateTime timestamp;

    public Notification(String message, LocalDateTime timestamp2) {
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    protected abstract void display();

}
