import java.util.ArrayList;
public class CustomerTable extends Table {
    String title = "Customer Table";
    ArrayList<String> attributes = new ArrayList<String>();
    ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

    public CustomerTable() {
        attributes.add("No");
        attributes.add("Name");
        attributes.add("Phone");
        attributes.add("Status");

        int i = 0;
        for (Customer c : Customer.customers) {
            data.add(new ArrayList<String>());
            data.get(i).add(Integer.toString(i+1));
            data.get(i).add(c.getName());
            data.get(i).add(c.getPhone());
            data.get(i).add(c.getStatus());
            i++;
        }

        setTitle(title);
        setAttributes(attributes);
        setData(data);
    }

}
