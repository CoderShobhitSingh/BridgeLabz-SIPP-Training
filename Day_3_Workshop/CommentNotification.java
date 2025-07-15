package Day_3_Workshop;

import java.time.LocalDateTime;

public class CommentNotification extends Notification {
    public CommentNotification(String message, LocalDateTime timestamp) {
        super(message, timestamp);
    }

    protected void display() {
        System.out.println("Comment: " + message + " at " + timestamp);
    }
}

