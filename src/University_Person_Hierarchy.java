/* Diego Martinez | 6401977
Dr. Xian Su
Homework #2
February 10, 2025
*/

// Superclass Person with private fields name and age
class Person {
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // Use setter to enforce validation
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation (age must be >= 0)
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error: Age cannot be negative.");
        }
    }

    // Introduce method (to be overridden)
    public void introduce() {
        System.out.println("I am a person named " + name + ", age " + age + ".");
    }
}

// Subclass Student extending Person
class Student extends Person {
    private String major; // Private field for major

    // Constructor to initialize Student fields
    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    // Getter for major
    public String getMajor() {
        return major;
    }

    // Setter for major
    public void setMajor(String major) {
        this.major = major;
    }

    // Override introduce() for Student
    @Override
    public void introduce() {
        System.out.println("I am a student majoring in " + major + ".");
    }
}

// Subclass Teacher extending Person
class Teacher extends Person {
    private String subject; // Private field for subject

    // Constructor to initialize Teacher fields
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Getter for subject
    public String getSubject() {
        return subject;
    }

    // Setter for subject
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Override introduce() for Teacher
    @Override
    public void introduce() {
        System.out.println("I teach " + subject + ".");
    }
}

public class University_Person_Hierarchy {
    public static void main(String[] args) {
        // Create an array of Person objects with Student and Teacher instances
        Person[] people = {
                new Student("Alice", 20, "Computer Science"),
                new Teacher("Bob", 40, "Mathematics"),
                new Student("Charlie", 22, "Biology"),
                new Teacher("David", 35, "Physics")
        };

        // Demonstrate encapsulation by modifying fields using setters
        people[0].setAge(21); // Updating age
        ((Student) people[0]).setMajor("Software Engineering"); // Updating major

        people[1].setAge(41); // Updating age
        ((Teacher) people[1]).setSubject("Advanced Mathematics"); // Updating subject

        // Loop through the array and call introduce() on each object
        for (Person p : people) {
            p.introduce(); // Calls the respective overridden method
        }
    }
}
