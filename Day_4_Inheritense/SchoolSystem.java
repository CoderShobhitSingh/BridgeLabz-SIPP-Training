package Day_4_Inheritense;

class Person{
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayRole(){
        System.out.println("Person Name: " + name);
        System.out.println("Person Age: " + age);
    }
}

class Teacher extends Person{
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        super.displayRole();
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person{
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        super.displayRole();
        System.out.println("Grade: " + grade);
    }
}   

class Staff extends Person{
    String position;

    Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    void displayRole() {
        super.displayRole();
        System.out.println("Position: " + position);
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 16, "10th Grade");
        Staff staff = new Staff("Charlie", 40, "Principal");

        System.out.println("Teacher Details:");
        teacher.displayRole();
        System.out.println();

        System.out.println("Student Details:");
        student.displayRole();
        System.out.println();

        System.out.println("Staff Details:");
        staff.displayRole();
    }
}
