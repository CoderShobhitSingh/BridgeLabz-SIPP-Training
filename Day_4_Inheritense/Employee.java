package Day_4_Inheritense;

public class Employee {
    String name;
    int id;
    double slary;

    Employee(String name,double slary) {
        this.name = name;
        this.slary = slary;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + slary);
    }

    class Manager extends Employee {
        String department;

        Manager(String name,double slary, String department) {
            super(name,slary);
            this.department = department;
        }

        
        void display() {
            super.display();
            System.out.println("Manager Department: " + department);
        }
    }

    class Developer extends Employee {
        String programmingLanguage;

        Developer(String name, int id, double slary, String programmingLanguage) {
            super(name,slary);
            this.programmingLanguage = programmingLanguage;
        }

        
        void display() {
            super.display();
            System.out.println("Developer Programming Language: " + programmingLanguage);
        }
    }

    class Intern extends Employee {
        String university;

        Intern(String name, int id, double slary, String university) {
            super(name,slary);
            this.university = university;
        }

        
        void display() {
            super.display();
            System.out.println("Intern University: " + university);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice",50000);
        Manager mgr1 = emp1.new Manager("Bob",70000, "Sales");
        Developer dev1 = emp1.new Developer("Charlie", 103, 60000, "Java");
        Intern intern1 = emp1.new Intern("David", 104, 20000, "XYZ University");

        emp1.display();
        System.out.println();
        mgr1.display();
        System.out.println();
        dev1.display();
        System.out.println();
        intern1.display();
    }

}
