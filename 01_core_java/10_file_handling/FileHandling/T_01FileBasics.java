import java.io.File;
import java.io.IOException;

public class T_01FileBasics {

    public static void main(String[] args) {

        // 1️⃣ Create File object (represents file metadata)
        File file = new File("sample.txt");

        try {

            // 2️⃣ Check if file exists
            if (file.exists()) {
                System.out.println("File already exists.");
            } else {
                boolean created = file.createNewFile();
                if (created) {
                    System.out.println("File created successfully.");
                }
            }

            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("File Size (bytes): " + file.length());
            
            // 4️⃣ Delete File (Uncomment to test)
            /*
            boolean deleted = file.delete();
            if (deleted) {
                System.out.println("File deleted successfully.");
            }
            */

        } catch (IOException e) {
            System.out.println("Error occurred while handling file.");
            e.printStackTrace();
        }
    }
}
