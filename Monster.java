public class Monster {

    // Fields
    String name;
    int health;

    // Constructor
    public Monster(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public static void main(String[] args) {

        // Monster object
        Monster monster = new Monster("Dragon", 100);

        // Attacks
        for (int round = 1; round <= 10; round++) {

            System.out.println("Attack " + round);

            monster.health -= 20;

            System.out.println("Monster health: " + monster.health);

            // Check if monster is defeated
            if (monster.health <= 0) {
                System.out.println("Monster defeated!");
                break;
            }
        }
    }
}