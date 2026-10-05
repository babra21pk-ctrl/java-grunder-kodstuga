public class ContinueTest {
    public static void main(String[] args) {

        for (int number = 1; number <= 10; number++) {

            if (number == 3) {
                continue;
            }

            System.out.println(number);
        }
    }
}