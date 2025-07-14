package Day_5_Encapsulation_Polymorphism_Abstract.E_CommercePlatform;

public class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;  
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12;  
    }

    @Override
    public String getTaxDetails() {
        return "12% GST on Clothing";
    }
}
