public class Car {

    String make;
    String model;
    int year;
    String color;

    // Parameterless constructor
    public Car() {
        this("Unknown", "Unknown", 0, "Unknown");
    }

    // Constructor with 2 parameters
    public Car(String make, String model) {
        this(make, model, 0, "Unknown");
    }

    // Parameterized constructor with all properties
    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public static void main(String[] args) {

        Car car1 = new Car();

        Car car2 = new Car("Toyota", "Corolla");

        Car car3 = new Car("BMW", "X5", 2025, "Black");

        System.out.println("Car 1:");
        System.out.println("Make: " + car1.make);
        System.out.println("Model: " + car1.model);
        System.out.println("Year: " + car1.year);
        System.out.println("Color: " + car1.color);

        System.out.println();

        System.out.println("Car 2:");
        System.out.println("Make: " + car2.make);
        System.out.println("Model: " + car2.model);
        System.out.println("Year: " + car2.year);
        System.out.println("Color: " + car2.color);

        System.out.println();

        System.out.println("Car 3:");
        System.out.println("Make: " + car3.make);
        System.out.println("Model: " + car3.model);
        System.out.println("Year: " + car3.year);
        System.out.println("Color: " + car3.color);
    }
}