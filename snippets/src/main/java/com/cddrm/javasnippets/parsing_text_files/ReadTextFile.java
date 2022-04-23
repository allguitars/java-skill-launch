package com.cddrm.javasnippets.parsing_text_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {

    public static void main(String[] args) throws FileNotFoundException {
        // 1. Read in the file
         File file = new File("/home/cddrm/Desktop/config-backup-restore/example.yaml");
//        File file = new File("/home/cddrm/Desktop/config-backup-restore/config.yml");

        // 2. Create a scanner based on the file
        Scanner scan = new Scanner(file);

        // 3. Scan through lines and print out the content
        while(scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
    }
}
