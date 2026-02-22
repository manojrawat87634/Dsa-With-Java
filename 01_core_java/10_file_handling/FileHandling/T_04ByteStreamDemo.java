import java.io.FileInputStream;
import java.io.FileOutputStream;

public class T_04ByteStreamDemo{
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("abc.jpg");
            FileOutputStream fos = new FileOutputStream("c.jpg");
            int data = fis.read();
            while (data != -1){
                fos.write(data);
                data = fis.read();
            }
            fis.close();
            fos.close();
            System.out.println("File Copied Successfully!!!");
        } catch (Exception e) {
            System.out.println("File Not copied");
        }
    }
}