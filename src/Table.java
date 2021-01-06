import java.security.PrivateKey;
import java.util.ArrayList;

public abstract class Table {
    private String title;
    private ArrayList<String> attributes;
    private ArrayList<ArrayList<String>> data;

    public Table () {}

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAttributes(ArrayList<String> attributes) {
        this.attributes = attributes;
    }

    public void setData(ArrayList<ArrayList<String>> data) {
        this.data = data;
    }

    private int[] maxCol() {
        int[] res = new int[attributes.size()];
        //Attributes length
        for (int i = 0; i < res.length; i++)
            res[i] = attributes.get(i).length();
        //Data length
        for (ArrayList<String> subData : data)
            for (int i = 0; i < res.length; i++)
                res[i] = Math.max(res[i], subData.get(i).length());

        return res;
    }

    public void show() {
        System.out.println(title + "\n");
        int[] maxCol = maxCol();

        for (int i = 0; i < attributes.size(); i++)
            System.out.print(attributes.get(i) + " ".repeat(maxCol[i] - attributes.get(i).length() + 3));
        System.out.println();

        for (ArrayList<String> subData : data) {
            for (int i = 0; i < attributes.size(); i++)
                System.out.print(subData.get(i) + " ".repeat(maxCol[i] - subData.get(i).length() + 3));
            System.out.println();
        }

    }

    public void toCSV() {
        ArrayList<ArrayList<String>> newData = new ArrayList<ArrayList<String>>();
        newData.add(attributes);
        newData.addAll(data);
        CSVFile.write(title, newData);
    }

}
