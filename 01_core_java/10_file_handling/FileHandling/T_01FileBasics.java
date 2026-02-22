import java.io.File;
import java.io.IOException;

public class T_01FileBasics{
    public static void main(String args[]){
        try {
            File file = new File("file.txt");
            
            if(file.exists()){
                System.out.println("File Created");
            }       
            else{
                boolean created = file.createNewFile();
                if(created){
                    System.out.println("File Created");
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}