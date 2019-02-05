package topic.e.java_file_io;

import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatingPath {

    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\");
        Path p2 = Paths.get(args[0]);
        Path p3 = Paths.get(URI.create("file:///Users/romo/FileTest.java"));
        Path p4 = FileSystems.getDefault().getPath("/users/romo");
        Path p5 = Paths.get(System.getProperty("user.home"), "logs", "foo.logs");

        System.out.println(p4.toUri());
        System.out.println(p4.toAbsolutePath());
    }
}
