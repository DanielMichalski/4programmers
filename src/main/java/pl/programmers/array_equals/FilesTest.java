package pl.programmers.array_equals;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Author: Daniel
 */
public class FilesTest {
    private String regulations;

    public static void main(String[] args) {
        new FilesTest();
    }

    public FilesTest() {
        loadRegulations();

        System.out.println(regulations);
    }

    private void loadRegulations() {
        try {
            URL resource = getClass().getResource("/tes.txt");
            Path file = Paths.get(resource.toURI());
            List<String> lines = Files.readAllLines(file, Charset.defaultCharset());
            StringBuilder sb = new StringBuilder();

            for (String line : lines) {
                sb.append(line);
                sb.append("\n");
            }

            regulations = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            regulations = "";
        }
    }
}
