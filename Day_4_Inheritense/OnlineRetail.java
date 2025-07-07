package Day_4_Inheritense;

class Order{
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    void displayOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

class ShippedOrder extends Order{
    int trackingNumber;

    ShippedOrder(int orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    void displayOrderInfo() {
        super.displayOrderInfo();
        System.out.println("Tracking Number: " + trackingNumber);
    }   
}

class DeliveredOrder extends ShippedOrder{
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    void displayOrderInfo() {
        super.displayOrderInfo();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}
public class OnlineRetail {
    public static void main(String[] args) {
        Order order = new Order(101, "2023-10-01");
        order.displayOrderInfo();
        
        ShippedOrder shippedOrder = new ShippedOrder(102, "2023-10-02", 123456);
        shippedOrder.displayOrderInfo();
        
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2023-10-03", 789012, "2023-10-05");
        deliveredOrder.displayOrderInfo();
    }
}
