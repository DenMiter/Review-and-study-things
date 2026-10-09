package FirstTasks;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A_Plus_B_2 {

    static char[] buf = new char[100];
    static String res;
    static int sum;

    public static void main(String[] args) {
        readInput();
        writeOutput();
    }

    public static void readInput() {
        String fileName = "C:\\Users\\user\\Desktop\\input.txt";
        try (FileReader fr = new FileReader(fileName)) {
            int charsRead = fr.read(buf);
            if (charsRead != -1) {
                res = new String(buf, 0, charsRead);
            }
            String[] nums = res.split(" ");
            int num1 = Integer.parseInt(nums[0]);
            int num2 = Integer.parseInt(nums[1]);
            sum = num1 + num2;
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }

    public static void writeOutput() {
        String fileName = "C:\\Users\\user\\Desktop\\output.txt";
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(Integer.toString(sum));
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }

}
