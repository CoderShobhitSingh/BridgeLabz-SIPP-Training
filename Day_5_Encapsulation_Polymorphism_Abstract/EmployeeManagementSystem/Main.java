package Day_5_Encapsulation_Polymorphism_Abstract.EmployeeManagementSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Alice", 50000, 10000);
        emp1.assignDepartment("Engineering");

        PartTimeEmployee emp2 = new PartTimeEmployee(102, "Bob", 20000, 40, 300);
        emp2.assignDepartment("Support");

        employees.add(emp1);
        employees.add(emp2);

        // Polymorphic behavior
        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}

