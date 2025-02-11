/* Diego Martinez | 6401977
Dr. Xian Su
Homework #2
February 10, 2025
*/

// Superclass Pet with private field type
class Pet {
    private String type; // Private field for pet type

    // Constructor to initialize type
    public Pet(String type) {
        this.type = type;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // purchase() method to be overridden by subclasses
    public void purchase() {
        System.out.println("I would like a pet.");
    }
}

// Fish subclass extending Pet
class Fish extends Pet {
    // Constructor for Fish
    public Fish() {
        super("fish"); // Calls superclass constructor with "fish"
    }

    // Override purchase() method
    @Override
    public void purchase() {
        System.out.println("I would like a fish.");
    }
}

// Dog subclass extending Pet
class Lizard extends Pet {
    private String breed; // Private field for breed

    // Constructor for Dog with breed initialization
    public Lizard(String breed) {
        super("Lizard"); // Calls superclass constructor with "dog"
        this.breed = breed;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    // Setter for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Override purchase() method to include breed
    @Override
    public void purchase() {
        System.out.println("I would like a " + breed + " Lizard.");
    }
}

// Turtle subclass extending Pet
class Turtle extends Pet {
    // Constructor for Turtle
    public Turtle() {
        super("turtle"); // Calls superclass constructor with "turtle"
    }

    // Override purchase() method
    @Override
    public void purchase() {
        System.out.println("I would like a turtle.");
    }
}


public class Buy_a_Pet {
    public static void main(String[] args) {
        // Create an array of Pet objects with different subclasses
        Pet[] pets = {
                new Fish(),
                new Lizard("Bearded Dragon"),
                new Turtle()
        };

        // Iterate over the array and call purchase() on each object
        for (Pet pet : pets) {
            pet.purchase(); // Calls the overridden method in each subclass
        }
    }
}
