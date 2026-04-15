package fileHandleing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesAndHandle {
    public static void main(String[] args) throws Exception {

        File file = new File("file.txt");

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        ExceptionHandle filesAndHandle = new ExceptionHandle();
        ExceptionHandle.checkException(5);

    }

}
