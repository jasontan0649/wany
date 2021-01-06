import java.util.ArrayList;

public class Shop {
    public static ArrayList<Shop> shops = new ArrayList<Shop>();

    private int id;
    private String name;
    private String phone;
    private String status;
    private String manager;

    public Shop(int id, String name, String phone, String status, String manager) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.status = status;
        this.manager = manager;
        shops.add(this);
    }

    public static ArrayList<Shop> getShops() {
        return shops;
    }

    public static void setShops(ArrayList<Shop> shops) {
        Shop.shops = shops;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
