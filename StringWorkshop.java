 public class StringWorkshop {
    public static void main(String[] args) {

        // Del 1 – String och variabler
        String firstName = "Anna";
        String lastName = "Andersson";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(fullName.length());


        // Del 2 – Skapa en mening
        System.out.println("Hej! Jag heter " + fullName + ". Mitt namn innehåller " + fullName.length() + " tecken.");


        // Bonus
        String city = "Göteborg";
        String profession = "Mjukvarutestare";

        System.out.println(firstName + " " + lastName + " bor i " + city + " och utbildar sig till " + profession);
    }
} 


