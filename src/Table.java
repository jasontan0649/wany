import java.util.ArrayList;

public class Table {
    public static void show(String title, ArrayList<String> attributes, ArrayList<ArrayList<String>> data) {
        System.out.println(title + "\n");

        //Dont do this
        for (String attribute : attributes)
            System.out.print(attribute + "    ");
        System.out.println();

        for (ArrayList<String> row : data) {
            for (String d : row)
                System.out.print(d + "   ");
            System.out.println();
        }

    }

    public static void toCSV(String title, ArrayList<String> attributes, ArrayList<ArrayList<String>> data) {

    }
}
