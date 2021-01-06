import java.util.ArrayList;

public class ShopTable {
    private String title = "Shop Table";
    private ArrayList<String> attributes = new ArrayList<String>();
    private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

    public ShopTable() {
        attributes.add("No");
        attributes.add("Name");
        attributes.add("Phone");
        attributes.add("Manager");
        attributes.add("Status");

        int i = 0;
        for (Shop s : Shop.shops) {
            data.add(new ArrayList<String>());
            data.get(i).add(Integer.toString(i+1));
            data.get(i).add(s.getName());
            data.get(i).add(s.getPhone());
            data.get(i).add(s.getManager());
            data.get(i).add(s.getStatus());
            i++;
        }
    }

    public void show() {
        Table.show(title, attributes, data);
    }

    public void toCSV() {
        Table.toCSV(title, attributes, data);
    }
}
