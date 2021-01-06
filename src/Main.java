public class Main {

    public static void main(String[] args) {
        new Shop(1, "Hello", "0123", "Normal", "Tan");
        new Shop(2, "World", "0123", "Normal", "Chee");

        new ShopTable().show();

        System.out.println("\n\n\n\n");


        new Customer("1111", "Jason", "0123", "Normal");
        new Customer("1111", "Jason", "0123", "Normal");
        new CustomerTable().show();
    }
}
