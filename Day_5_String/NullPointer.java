package Day_5_String;

public class NullPointer {
    static void generateNPE() {
        String text = null;
        System.out.println(text.toUpperCase());   // Boom!
    }

    static void handleNPE() {
        String text = null;
        try {
            System.out.println(text.toUpperCase());
        } catch (NullPointerException npe) {
            System.out.println("Handled NPE: " + npe);
        }
    }

    public static void main(String[] args) {
        generateNPE();
        handleNPE();
    }
}
