import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        new Customer("1111", "Jason", "0123", "Normal");
        new Customer("1111", "Jason", "0123", "Normal");
        new CustomerTable().toCSV();

        ArrayList<ArrayList<String>> tmp = CSVFile.read("Customer Table");
        System.out.println(tmp);
    }
}
