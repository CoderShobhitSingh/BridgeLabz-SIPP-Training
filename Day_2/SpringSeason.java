package Day_2;

public class SpringSeason {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        boolean isSpring = false;

        switch (month) {
            case 3:
                if (day >= 20 && day <= 31) {
                    isSpring = true;
                }
                break;
            case 4:
                if (day >= 1 && day <= 30) {
                    isSpring = true;
                }
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    isSpring = true;
                }
                break;
            case 6:
                if (day >= 1 && day <= 20) {
                    isSpring = true;
                }
                break;
            default:
                isSpring = false;
        }

        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
