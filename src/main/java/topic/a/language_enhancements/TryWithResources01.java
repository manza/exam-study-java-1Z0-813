package topic.a.language_enhancements;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class TryWithResources01 {

    public static void main(String[] args) throws IOException {
        System.out.println(readFirstLineFromFile("C:\\users\\romo\\test.mv.db"));
        System.out.println(readFirstLineFromFileWithFinallyBlock("C:\\users\\romo\\test.mv.db"));
        writeToFileZipFileContents("C:\\users\\romo\\downloads\\react-3-9-nested-components-1.zip", "C:\\users\\romo\\saida.txt");
    }

    static String readFirstLineFromFile(String path) throws IOException {
        // will always close the br even though any exception occurs during the reading process
        try (BufferedReader br =
                     new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    static String readFirstLineFromFileWithFinallyBlock(String path) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            // careful: will raise exception to the top of stack in case br.clse generates an exception
            if (br != null) br.close();
        }
    }

    static void writeToFileZipFileContents(String zipFileName, String outputFileName) throws IOException {
        Charset charset = StandardCharsets.US_ASCII;
        Path outputFilePath = Paths.get(outputFileName);

        // Open zip and create output of file contents
        // Handled by Try / Resource

        try (ZipFile zf = new ZipFile(zipFileName);
             BufferedWriter writer = Files.newBufferedWriter(outputFilePath, charset);
        ) {
            for (Enumeration entries = zf.entries(); entries.hasMoreElements();) {
                String newLine = System.getProperty("line.separator");
                String zipName = ((ZipEntry)entries.nextElement()).getName() + newLine;
                writer.write(zipName, 0, zipName.length());
            }
        }
    }


}
