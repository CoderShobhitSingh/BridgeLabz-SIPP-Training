package Day_2_Level_1_practice;

public class ProfitLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;

        int Profit = sellingPrice - costPrice;
        int profitPercentage = Profit / costPrice * 100;

        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR "+sellingPrice);
        System.out.println("The Profit is INR "+ Profit + " and the Profit Percentage is"+ profitPercentage);



    }
}
