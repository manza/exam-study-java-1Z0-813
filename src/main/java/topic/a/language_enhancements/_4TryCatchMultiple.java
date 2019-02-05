package topic.a.language_enhancements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class _4TryCatchMultiple {

    public static void main(String[] args) {

    }

    public void regularTryCatch() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\"));
            bufferedReader.readLine();
        } catch (IndexOutOfBoundsException e1) {
            System.out.println(e1.getMessage());
        } catch (IOException e2) {
            System.out.println(e2.getMessage());
        }
    }

    public void newFormatTryCatch() {

        // Rules: Exceptions can not be in the same hierarchy level
        // Rules: Can not assign exceptions to other variables
        try {
            BufferedReader bf = new BufferedReader(new FileReader("C:\\"));
            bf.readLine();
        } catch (IOException|IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
