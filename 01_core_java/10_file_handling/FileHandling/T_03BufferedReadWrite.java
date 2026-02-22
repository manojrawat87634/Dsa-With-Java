import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class T_03BufferedReadWrite{
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

            String myNotes [] = {"Today I have to learn Java", "Today I have to learn python "};
            BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
            for (int i = 0; i < myNotes.length; i++){
                bw.write(myNotes[i] + "\n");
            }
            bw.close();
            br.close();
        } catch (Exception e) {

        }
    }
}