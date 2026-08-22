package FirstTasks;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NotDeafPhone_1 {

    String res;
    char[] buf = new char[3];

    public static void main (String[] args) {
        NotDeafPhone_1 notDeafPhone = new NotDeafPhone_1();
        notDeafPhone.readNum();
        notDeafPhone.writeNum();
    }

    public void readNum() {
        String fileName2 = "C:\\Users\\user\\Desktop\\input.txt";
        try (FileReader fileReader = new FileReader(fileName2)){
            int charsRead = fileReader.read(buf);
            if (charsRead != -1) {
                res = new String(buf, 0, charsRead);
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }

    public void writeNum() {
        String fileName = "C:\\Users\\user\\Desktop\\output.txt";
        try (FileWriter fileWriter = new FileWriter(fileName, false)) {
            fileWriter.write(res);
            fileWriter.flush();
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }

}