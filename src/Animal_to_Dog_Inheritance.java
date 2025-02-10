/* Diego Martinez | 6401977
Dr. Xian Su
Homework #2
February 10, 2025
*/

class Animal {
    // Method to make animal sound
    void makeSound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    // Override the makeSound method to a new implementation for Dog
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }

}

public class Animal_to_Dog_Inheritance {
    public static void main(String[] args) {
        // Create an object (instance) of the Dog class
        Animal myDog = new Dog();
        // Call the makeSound method on the Doh object
        myDog.makeSound();
    }
}