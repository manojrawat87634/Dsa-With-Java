import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class T_03BufferedReadWrite {

    public static void main(String[] args) {

        String filePath = "bufferedSample.txt";

        // -------- Writing --------
        try {
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter writer = new BufferedWriter(fw);

            writer.write("Hello from Buffered Writer");
            writer.newLine();
            writer.write("Learning Buffered step by step");
            writer.newLine();

            writer.close();   // closes both writer and fw

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing.");
        }

        // -------- Reading --------
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fr);

            String line;

            System.out.println("\nReading file content:");

            while (true) {
                line = reader.readLine();

                if (line == null) {
                    break;
                }

                System.out.println(line);
            }

            reader.close();   // closes both reader and fr

        } catch (IOException e) {
            System.out.println("Error while reading.");
        }
    }
}
