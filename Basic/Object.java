// A class is a blueprint or template used to create objects. It defines the structure that specifies
//  the data members (attributes) and functions (methods) an object will contain
// Define a class
class Car {
    // Attribute
    String color;
    String model;

    // Method: starts the engine
    void startEngine() {
        System.out.println(model + " engine started");
    }

    // Method: stops the engine
    void stopEngine() {
        System.out.println(model + " engine stopped");
    }
}
// An object is an instance of a class. It represents a real-world entity created using the class blueprint

public class Object {

    public static void main(String[] args) {

        // Create first car object
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Toyota";

        // Use attributes and methods
        System.out.println("My car color: " + myCar.color);
        myCar.startEngine();
        myCar.stopEngine();
    }
}