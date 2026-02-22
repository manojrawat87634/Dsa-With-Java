// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// import java.io.IOException;
// import java.util.List;

// public class T_05NioFileDemo {

//     public static void main(String[] args) {

//         String filePath = "nioSample.txt";

//         Path path = Paths.get(filePath);

//         // -------- Writing to file --------
//         String data = "Hello NIO!\nLearning modern file handling in Java.";

//         try {
//             // Write all bytes at once (overwrites file)
//             Files.write(path, data.getBytes());

//             System.out.println("Data written successfully using NIO.");

//         } catch (IOException e) {
//             System.out.println("Error writing file.");
//             e.printStackTrace();
//         }

//         // -------- Reading from file --------
//         try {
//             // Read all lines at once
//             List<String> lines = Files.readAllLines(path);

//             System.out.println("\nReading file content using NIO:");

//             for (String line : lines) {
//                 System.out.println(line);
//             }

//         } catch (IOException e) {
//             System.out.println("Error reading file.");
//             e.printStackTrace();
//         }
//     }
// }

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class T_05NioFileDemo{
    public static void main(String[] args) {
        try {
            Path path = Paths.get("data.txt");
            Files.write(path, "Hello Manoj Sir".getBytes());
            
        } catch (IOException e) {

        }
    }
}