public class Pet {

    // Private fields
    private String name;
    private int hunger;
    private int energy;

    // Constructor
    public Pet(String name, int hunger, int energy) {
        this.name = name;
        this.hunger = hunger;
        this.energy = energy;
    }

    // Eat method
    public void eat() {
        hunger -= 20;

        if (hunger < 0) {
            hunger = 0;
        }

        System.out.println(name + " äter.");
        System.out.println("Hunger: " + hunger);
    }

    // Play method
    public void play() {

        if (energy < 20) {
            System.out.println(name + " vägrar leka. För lite energi!");
            return;
        }

        energy -= 20;
        hunger += 10;

        System.out.println(name + " leker.");
        System.out.println("Energy: " + energy);
        System.out.println("Hunger: " + hunger);

        if (hunger > 80) {
            System.out.println(name + " klagar: Jag är hungrig!");
        }
    }

    // Main
    public static void main(String[] args) {

        Pet pet = new Pet("Milo", 50, 80);

        pet.play();
        pet.play();
        pet.play();
        pet.eat();
    }
}