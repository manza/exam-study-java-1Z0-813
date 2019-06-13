package topic.e.java_file_io;

import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatingPath {

    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\");
        Path p2;
        if (args.length > 0) {
            p2 = Paths.get(args[0]);
        }
        Path p3 = Paths.get(URI.create("file:///Users/romo/FileTest.java"));
        Path p4 = FileSystems.getDefault().getPath("/users/romo");
        Path p5 = Paths.get(System.getProperty("user.home"), "logs", "foo.logs");

        System.out.println(p4.toUri());
        System.out.println(p4.toAbsolutePath());

        Path path = Paths.get("c:\\temp.txt");
        System.out.println(Files.exists(path));

        Path myPath = Paths.get("c:\\users\\romo");
        System.out.println("getFileName: " + myPath.getFileName());
        System.out.println("getName(1): " + myPath.getName(1));
        System.out.println("getNameCount: " + myPath.getNameCount());
        System.out.println("getParent: " + myPath.getParent());
        System.out.println("getRoot: " + myPath.getRoot());
        System.out.println("subPath(0,2): " + myPath.subpath(0, 2));
        System.out.println("toString: " + myPath.toString());

        Path path2 = Paths.get("/sdfsd");
        //path.resolve(null); // Error -> does not compile

        Path path3 = Paths.get("/sdfsd");
        Path other = null;
        path.resolve(other);
        path.resolve((String)null);


    }
}
