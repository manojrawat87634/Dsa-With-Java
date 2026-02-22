package projects.CSVProcesser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class CSVProcessor{
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("inp.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.csv"));
            Set <String> uniqueRows = new HashSet<>();
            String line;
            boolean isHeader = true;
            while ((line = br.readLine()) != null){
                
                if (isHeader){
                    bw.write(line);
                    bw.newLine();
                    isHeader = false;
                    continue;
                }
                String [] columns = line.split(",");
                if (columns.length != 3){
                    continue;
                }
                if (!EMAIL_PATTERN.matcher(columns[2]).matches()){
                    continue;
                }
                if(uniqueRows.add(line)){
                    bw.write(line);
                    bw.newLine();
                }
            }
            br.close();
            bw.close();
        } catch (Exception e) {
        
        }
    }
}
