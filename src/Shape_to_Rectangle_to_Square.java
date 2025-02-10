/* Diego Martinez | 6401977
Dr. Xian Su
Homework #2
February 10, 2025
*/

class Shape {

    // Protected field for encapsulation to store the area of the shape
    protected double area;

    // Getter method to retrieve the area
    public double getArea() {
        return area;
    }

    // Setter method to update the area
    public void setArea(double area) {
        this.area = area;
    }

    // Method to calculate area (to be overridden in subclasses)
    public void calculateArea() {
        System.out.println("Area calculation not defined for shape.");
    }
}

class Rectangle extends Shape {
    //Fields for rectangle dimensions
    protected double width, height;

    // Constructor to initialize width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override calculateArea to compute and store the area of the rectangle
    @Override
    public void calculateArea() {
        area = width * height; // Rectangle area formula
    }
}

class Square extends Rectangle {
    // Constructor ensures width and height are the same by passing the same value to the Rectangle constructor
    public Square(double side) {
        super(side, side); // Calls Rectangle constructor with equal width and height
    }
}

public class Shape_to_Rectangle_to_Square {
    public static void main(String[] args) {
        // Create a Shape reference pointing to a Rectangle instance with width 5 and height 10
        Shape rect = new Rectangle(5, 10);
        // Create a Shape reference pointing to a Square instance with side length 4
        Shape square = new Square(4);

        // Call calculateArea method for Rectangle instance
        rect.calculateArea();

        // Print the calculated area of the rectangle
        System.out.println("Rectangle Area: " + rect.getArea());

        // Call calculateArea method for Square instance
        square.calculateArea();

        //Print the calculated area of the square
        System.out.println("Square Area: " + square.getArea());
    }
}
