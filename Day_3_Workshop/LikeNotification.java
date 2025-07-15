package Day_3_Workshop;

import java.time.LocalDateTime;

public class LikeNotification extends Notification{

	public LikeNotification(String message,LocalDateTime timestamp) {
        super(message, timestamp);
    }

    protected void display() {
            System.out.println("Like: " + message + " at " + timestamp);
    }
}
