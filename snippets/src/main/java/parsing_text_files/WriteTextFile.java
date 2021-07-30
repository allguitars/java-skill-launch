package parsing_text_files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteTextFile {

    public static void main(String[] args) throws IOException {
        // 1. Read in the file and create the file scanner
        // File file = new File("/home/cddrm/Desktop/config-backup-restore/example.yaml");
        File file = new File("/home/cddrm/Desktop/config-backup-restore/config.yml");
        Scanner scan = new Scanner(file);

        // 2. Create a FileWriter object
        FileWriter writer = new FileWriter("/home/cddrm/Desktop/config-backup-restore/exported.yaml");

        // 3. Write the content
        String line = "";
        int i = 1;
        while(scan.hasNextLine() && i <= 1000000) {
            line = scan.nextLine().concat(scan.hasNextLine()? "\n" : "");
            writer.write(line);
            i++;
        }

        // 4. Close the File Writer
        writer.close();
    }
}
