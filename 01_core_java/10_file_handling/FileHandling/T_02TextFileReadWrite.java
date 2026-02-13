import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class T_02TextFileReadWrite {

    public static void main(String[] args) {
        String filePath = "sample.txt";
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write("Hello Java\n");
            writer.write("File Handling Basics\n");
            writer.close();
            System.out.println("Data Written successfully");
        } catch (IOException e) {
            System.out.println("Error while writing.");
        }
        try {
            FileReader reader = new FileReader(filePath);
            int data = reader.read();
            System.out.print("\nReading file content:");
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error while reading.");
        }
    }
}
