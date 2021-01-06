import java.util.ArrayList;

public class Customer {
    public static ArrayList<Customer> customers = new ArrayList<Customer>();

    private String password;
    private String name;
    private String phone;
    private String status;

    public Customer(String password, String name, String phone, String status) {
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.status = status;
        customers.add(this);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
