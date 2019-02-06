package topic.e.java_file_io;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherEx {

    public static void main(String[] args) {
        PathMatcher pm = FileSystems.getDefault().getPathMatcher("glob:*.*");
        Path fileName = Paths.get("C:/");
        if (pm.matches(fileName)) {
            System.out.println(fileName);
        }
    }
}
