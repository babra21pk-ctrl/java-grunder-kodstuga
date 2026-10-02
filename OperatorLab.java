public class OperatorLab {
    public static void main(String[] args) {

        // Del 1 – Arithmetic operators
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


        // Del 2 – Remainder (%)
       int number = 18;

        System.out.println(number % 2);


        // Del 3 – Boolean experiment
        int age = 20;

        boolean test1 = age > 18;
        boolean test2 = age < 18;
        boolean test3 = age == 20;
        boolean test4 = age != 20;

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);


        // Logical operators
        boolean hasTicket = true;
        boolean isAdult = true;

        boolean allowed = hasTicket && isAdult;

        System.out.println(allowed);


        // Test || (OR)
        boolean allowedWithOr = hasTicket || isAdult;

        System.out.println(allowedWithOr);
    }
}