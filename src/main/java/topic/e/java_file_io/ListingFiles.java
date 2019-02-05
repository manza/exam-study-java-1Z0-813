package topic.e.java_file_io;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class ListingFiles {

    public static void main(String[] args) {
        Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
        for(Path name : dirs) {
            System.out.println(name);
        }

    }
}
