package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileOps {
    public static void readFile(){
//        File file = new File("src/main/resources/my-file.txt");
        File file = new File("src/main/resources/no-file.txt");
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception: " + e + "\nMessage: " + e.getMessage() + "\nStackTrace: " + Arrays.toString(e.getStackTrace()));
        }
    }
}
