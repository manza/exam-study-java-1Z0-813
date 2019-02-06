package topic.e.java_file_io;

import java.io.IOException;
import java.nio.file.*;
import java.util.concurrent.TimeUnit;

public class WatcherExample {

    public static void main(String[] args) throws IOException, InterruptedException {
        WatchService watchService = FileSystems.getDefault().newWatchService();
        Path path = Paths.get(System.getProperty("user.home"));
        System.out.println("Watching: " + path);
        path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);

        WatchKey watchKey = null;
        while (true) {
            watchKey = watchService.poll(15, TimeUnit.SECONDS);
            if (watchKey != null) {
                watchKey.pollEvents().stream().forEach(watchEvent -> {
                    System.out.println(watchEvent.context());

                });
                watchKey.reset();

            }
        }
    }
}
