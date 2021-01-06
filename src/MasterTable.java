import java.util.ArrayList;

public class MasterTable {
    private String title = "Shop Table";
    private ArrayList<String> attributes;
    private ArrayList<ArrayList<String>> data;


    public MasterTable() {


    }

    public void show() {
        Table.show(title, attributes, data);
    }

    public void toCSV() {
        Table.toCSV(title, attributes, data);
    }
}
