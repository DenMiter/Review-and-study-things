package FirstTasks;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Beads_3 {

    static char[] buf = new char[5];
    static String res;
    static int answer;

    public static void main(String[] args) {
        readInputFile();
        writeOutputFile();
    }

    public static void readInputFile(){
        String fileName = "C:\\Users\\user\\Desktop\\input.txt";
        try (FileReader fr = new FileReader(fileName)){
            int charsRead = fr.read(buf);
            if (charsRead != -1){
                res = new String(buf, 0, charsRead);
            }
            answer = Integer.parseInt(res) + 1;
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void writeOutputFile(){
        String fileName = "C:\\Users\\user\\Desktop\\output.txt";
        try (FileWriter fw = new FileWriter(fileName)){
            fw.write(String.valueOf(answer));
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
