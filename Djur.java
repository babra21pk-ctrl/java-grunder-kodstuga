public class Djur {

    // Fields
    String namn;
    int ålder;
    String ljud;

    // Konstruktor
    public Djur(String namn, int ålder, String ljud) {
        this.namn = namn;
        this.ålder = ålder;
        this.ljud = ljud;
    }

    // Metod
    public void gorLjud() {
        System.out.println(namn + " säger: " + ljud);
    }

    // Main
    public static void main(String[] args) {

        // Två Djur-objekt
        Djur hund = new Djur("Max", 5, "Voff!");
        Djur katt = new Djur("Cato", 3, "Mjau!");

        // Punktoperatorn .
        hund.gorLjud();
        katt.gorLjud();
    }
}