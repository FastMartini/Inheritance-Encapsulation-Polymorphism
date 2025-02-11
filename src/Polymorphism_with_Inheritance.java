/* Diego Martinez | 6401977
Dr. Xian Su
Homework #2
February 10, 2025
*/

// Superclass Employee with name and salary fields
class Employee {
    protected String name;
    protected double salary;

    // Constructor to initialize name and salary
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Generic work method to be overridden
    public void work() {
        System.out.println("Employee is working.");
    }
}

// Subclass Manager inheriting from Employee
class Manager extends Employee {
    // Constructor to initialize Manager-specific details
    public Manager(String name, double salary) {
        super(name, salary);
    }

    // Overriding work method for Manager
    @Override
    public void work() {
        System.out.println("Manager is holding a meeting.");
    }
}

// Subclass Engineer inheriting from Employee
class Engineer extends Employee {
    // Constructor to initialize Engineer-specific details
    public Engineer(String name, double salary) {
        super(name, salary);
    }

    // Overriding work method for Engineer
    @Override
    public void work() {
        System.out.println("Engineer is coding.");
    }
}

public class Polymorphism_with_Inheritance {
    public static void main(String[] args) {
        // Create an array of Employee objects with Manager and Engineer instances
        Employee[] employees = {
                new Manager("Alice", 80000),
                new Engineer("Bob", 70000),
                new Manager("Charlie", 90000),
                new Engineer("David", 75000)
        };

        // Loop through the array and call work() on each object
        for (Employee emp : employees) {
            emp.work(); // Calls the respective overridden method
        }
    }
}
