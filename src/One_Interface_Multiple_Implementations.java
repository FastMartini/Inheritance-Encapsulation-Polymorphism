// Define an interface Drawable with a method draw()
interface Drawable {
    void draw();
}

// Implement the Drawable interface in the Circle class
class Circle implements Drawable {
    // Implement the draw method for Circle
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Implement the Drawable interface in the Rectangle class
class Rect implements Drawable {
    // Implement the draw method for Rectangle
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}


public class One_Interface_Multiple_Implementations {
    public static void main(String[] args) {
        // Create an array of Drawable objects holding Circle and Rectangle instances
        Drawable[] shapes = {new Circle(), new Rect()};

        // Loop through the array and call draw() on each object
        for (Drawable shape : shapes) {
            shape.draw(); // Calls the respective draw method based on the object type
        }
    }
}
