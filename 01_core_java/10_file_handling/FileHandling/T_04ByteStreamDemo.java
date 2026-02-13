import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class T_04ByteStreamDemo {

    public static void main(String[] args) {
        String sourceFile = "t.jpg";
        String destFile = "copy.jpg";
        try {
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }

            fis.close();
            fos.close();

            System.out.println("Image copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
