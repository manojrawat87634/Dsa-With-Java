import java.io.FileReader;
import java.io.FileWriter;

public class T_02TextFileReadWrite{
    public static void main(String[] args) {
        try {
             FileWriter writer = new FileWriter("file.txt");
             writer.write("I am the best I am the upcomming and I am the greatest\n");   
             writer.write("I am the best");
             writer.close();

             FileReader reader = new FileReader("file.txt");
             System.out.println(reader.readAllLines().toString());
             reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}