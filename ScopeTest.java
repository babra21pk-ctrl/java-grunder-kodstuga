public class ScopeTest {
    public static void main(String[] args) {

        {
            int price = 100;
            System.out.println(price);
        }

        System.out.println(price);
    }
}