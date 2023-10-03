package src.main.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(System.getProperty("user.dir"));
        System.out.println("Enter file or directory name: ");
        Path path = Paths.get(in.nextLine());
        if (Files.exists(path)) {
            System.out.println(path.getFileName());
            System.out.println("Is a directory?: "+Files.isDirectory(path));
            System.out.println("Is absolute path?: "+path.isAbsolute());
            try {
                System.out.println("Last modified time: "+Files.getLastModifiedTime(path));
                System.out.println("Size: "+Files.size(path));
            }catch (IOException e){
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
            System.out.println("Path: "+path);
            System.out.println("Absolute Path: "+path.toAbsolutePath());
        }
    }
}
