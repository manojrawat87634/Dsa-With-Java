package projects.backup_files;
import java.io.IOException;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    private static final String SOURCE_DIR = "source";
    private static final String BACKUP_DIR = "backup";

    public static void main(String[] args) {

        try {
            Path sourcePath = Paths.get(SOURCE_DIR);
            Path backupPath = Paths.get(BACKUP_DIR);

            // Create backup folder if not exists
            if (!Files.exists(backupPath)) {
                Files.createDirectories(backupPath);
            }

            WatchService watchService = FileSystems.getDefault().newWatchService();

            sourcePath.register(watchService,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_MODIFY);

            System.out.println("Monitoring folder: " + SOURCE_DIR);

            while (true) {
                WatchKey key = watchService.take();

                for (WatchEvent<?> event : key.pollEvents()) {

                    // WatchEvent.Kind<?> kind = event.kind();

                    Path fileName = (Path) event.context();
                    Path fullSourcePath = sourcePath.resolve(fileName);

                    if (Files.isRegularFile(fullSourcePath)) {

                        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss")
                                .format(new Date());

                        Path backupFile = backupPath.resolve(
                                fileName.getFileName().toString()
                                        + "_" + timestamp);

                        Files.copy(fullSourcePath, backupFile,
                                StandardCopyOption.REPLACE_EXISTING);

                        System.out.println("Backed up: " + fileName);
                    }
                }

                key.reset();
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}