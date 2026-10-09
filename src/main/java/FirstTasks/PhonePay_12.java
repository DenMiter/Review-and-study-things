package FirstTasks;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PhonePay_12 {

    public static char[] buf = new char[19];
    public static String values;
    public static int result;
    public static int[] ints = new int[4];

    public static void main(String[] args) {
        readInput();
        writeOutput();
    }

    public static void readInput() {
        String path = "C:\\Users\\user\\Desktop\\input.txt";
        try (FileReader fr = new FileReader(path)) {
            int charsRead = fr.read(buf);
            if ((charsRead) != -1) {
                values = new String(buf, 0, charsRead);
                String[] separatedValues = values.split(" ");

                for (int i = 0; i < separatedValues.length; i++) {
                    ints[i] = Integer.parseInt(separatedValues[i]);
                }

                if (ints[0] > ints[3]) {
                    result = ints[1] * ints[3];
                } else {
                    result = ints[2] * ints[3];
                }

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void writeOutput() {
        String path = "C:\\Users\\user\\Desktop\\output.txt";
        try (FileWriter fw = new FileWriter(path)) {
            fw.write(String.valueOf(result));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
