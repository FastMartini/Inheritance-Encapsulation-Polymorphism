/* Diego Martinez | 6401977
Dr. Xian Su
Homework #2
February 10, 2025
*/

class Food {
    private String name; // Private field for food name

    // Constructor to initialize name
    public Food(String name) {
        this.name = name;
    }

    // Generic prepare method to be overridden
    public void prepare() {
        System.out.println("Preparing " + name + "...");
    }
}

// Subclass Pizza extending Food
class Pizza extends Food {
    // Constructor to initialize Pizza name
    public Pizza() {
        super("Pizza"); // Calls the superclass constructor
    }

    // Override prepare() method for Pizza
    @Override
    public void prepare() {
        System.out.println("Baking a pizza!");
    }
}

// Subclass Burger extending Food
class Burger extends Food {
    // Constructor to initialize Burger name
    public Burger() {
        super("Burger"); // Calls the superclass constructor
    }

    // Override prepare() method for Burger
    @Override
    public void prepare() {
        System.out.println("Grilling a burger!");
    }
}

public class Polymorphism_and_Inheritance {
    public static void main(String[] args) {
        // Create instances of Pizza and Burger
        Food myPizza = new Pizza();
        Food myBurger = new Burger();

        // Call prepare() method on each object
        myPizza.prepare(); // Calls overridden method in Pizza
        myBurger.prepare(); // Calls overridden method in Burger
    }
}
