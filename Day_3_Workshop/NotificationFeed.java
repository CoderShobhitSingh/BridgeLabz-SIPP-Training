package Day_3_Workshop;

import java.util.LinkedList;

public class NotificationFeed {
    LinkedList<Notification> feed = new LinkedList<>();

    public void add(Notification notification) {
        feed.addFirst(notification);
        if (feed.size() > 10) {
            feed.removeLast(); 
        }
    }

    public void show() {
        System.out.println("Notification Feed");
        for (Notification n : feed) {
            n.display();
        }
    }
}
