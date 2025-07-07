package Day_4_Inheritense;

class Course{
    String courseName;
    String duration;

    Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
    }
}

class OnlineCourse extends Course {
    String platform;

    OnlineCourse(String courseName, String duration, String platform) {
        super(courseName, duration);
        this.platform = platform;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double price;

    PaidOnlineCourse(String courseName, String duration, String platform, double price) {
        super(courseName, duration, platform);
        this.price = price;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Price: $" + price);
    }
}


public class EducationalCourse {
    public static void main(String[] args) {
        Course course = new Course("Java Programming", "3 months");
        course.displayInfo();
        
        System.out.println();

        OnlineCourse onlineCourse = new OnlineCourse("Python Programming", "2 months", "Coursera");
        onlineCourse.displayInfo();
        
        System.out.println();

        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Web Development", "4 months", "Udemy", 49.99);
        paidOnlineCourse.displayInfo();
    }
}
