public class Student_GPA {
    // Private field for student ID
    private int id;
    // Private field for student name
    private String name;
    // Private field for student GPA
    private double gpa;

    // Constructor with GPA validation
    public Student_GPA(int id, String name, double gpa) {
        // Assign student ID to the field
        this.id = id;
        // Assign student name to the field
        this.name = name;
        // Call setGpa method to validate and set GPA
        setGpa(gpa);
    }

    // Getter for GPA
    public double getGpa() {
        // Return the current GPA value
        return gpa;
    }

    // Setter for GPA with validation
    public void setGpa(double gpa) {
        // Check if GPA is within valid range
        if (gpa >= 0.0 && gpa <= 4.0) {
            // Assign GPA to the field if valid
            this.gpa = gpa;
        } else {
            // Print error if GPA is invalid
            System.out.println("Error: GPA must be between 0.0 and 4.0.");
        }
    }

    // Main method to test the GPA validation
    public static void main(String[] args) {
        // Create a student with valid GPA
        Student_GPA student1 = new Student_GPA(1, "Diego", 3.5);
        // Print student 1 GPA
        System.out.println("Student 1 GPA: " + student1.getGpa());

        // Create a student with invalid GPA
        Student_GPA student2 = new Student_GPA(2, "Alex", 4.5);
        // Print student 2 GPA (should be 0.0)
        System.out.println("Student 2 GPA: " + student2.getGpa());

        // Update student 2 GPA to a valid value
        student2.setGpa(3.8);
        // Print updated student 2 GPA
        System.out.println("Student 2 GPA after update: " + student2.getGpa());

        // Attempt to set an invalid GPA for student 2
        student2.setGpa(5.0);
    }
}

