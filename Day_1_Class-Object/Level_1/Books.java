public class Books {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public Books(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book '" + title + "' has been borrowed successfully.");
        } else {
            System.out.println("Book '" + title + "' is currently not available.");
        }
    }

    public void displayBookInfo() {
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : " + price);
        System.out.println("Available  : " + (isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Books book1 = new Books("Atomic Habits", "James Clear", 499.0, true);
        Books book2 = new Books("The Alchemist", "Paulo Coelho", 299.0, false);

        book1.displayBookInfo();
        book2.displayBookInfo();

        book1.borrowBook();  
        book2.borrowBook();  

        book1.displayBookInfo();
    }
}
