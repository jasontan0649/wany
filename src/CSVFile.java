import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CSVFile {
    public static void write(String fileName, ArrayList<ArrayList<String>> data) {
        String res = "";
        for (ArrayList subData : data)
            res += String.join(",",subData) + "\n";
        res = res.stripTrailing();

        //Create File
        try{
            File f = new File(fileName+".csv");
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Write file
        try {
            FileWriter f = new FileWriter(fileName+".csv");
            f.write(res);
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<ArrayList<String>> read (String fileName) {
        ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();

        try {
            File f = new File(fileName + ".csv");
            Scanner data = new Scanner(f);
            while (data.hasNextLine()) {
              String[] tmp = data.nextLine().split(",");
              res.add(new ArrayList<String>(Arrays.asList(tmp)));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return res;
    }
}
