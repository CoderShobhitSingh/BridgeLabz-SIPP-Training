package Day_5_Encapsulation_Polymorphism_Abstract.E_CommercePlatform;

public class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;  
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;  
    }

    @Override
    public String getTaxDetails() {
        return "18% GST on Electronics";
    }
}
