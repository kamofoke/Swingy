package kamofoke.swingy.Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
  public static File file = null;
    private static FileWriter fWriter;

    public WriteFile() {

    }

    public static void createFile() {
        try {
            if (file == null) {
                file = new File("Heroes.txt");
                file.createNewFile();
            }

            fWriter = new FileWriter(file, true);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void writeToFile(String str) {
        try {
            file = new File("Heroes.txt");
            fWriter = new FileWriter(file, true);

            fWriter.append(str);
            fWriter.append('\n');
            fWriter.close();
            System.out.println(str);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void closeFile() {
        try {
            if (fWriter != null)
                fWriter.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
