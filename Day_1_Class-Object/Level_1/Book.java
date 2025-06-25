public class Book {

    public String title;
    public String author;
    public int price;


    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book(){

    }
    public static void main(String[] args) {
        Book b1 = new Book("Let us c", "Yashwant Kanitkar",150);
        
        Book b2 = new Book();

        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.price);
        
        System.out.println(b2.title);
        System.out.println(b2.author);
        System.out.println(b2.price);
    }
}
