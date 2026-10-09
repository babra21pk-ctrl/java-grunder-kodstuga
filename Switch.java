public class Switch {
    public static void main(String[] args) {

        int choice = 1;
        switch (choice) {
            case 1:
                System.out.println("Rice ");
                break;
            case 2:
               System.out.println("Kebab");
                break;
            case 3:
                System.out.println("Mutton"); 
                break;
            case 4:
                 System.out.println("Chicken.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
