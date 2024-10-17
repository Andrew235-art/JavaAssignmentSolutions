// 9. File Handling with Exception Handling 

import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner; 

public class FileReaderExample { 
    public static void main(String[] args) { 

        try { File file = new File("data.txt"); 
        
        Scanner scanner = new Scanner(file); 
        
        while (scanner.hasNextLine()) { 
            String line = scanner.nextLine(); 
            System.out.println(line); 
        } 
        scanner.close(); 
        } catch (FileNotFoundException e) { 

        System.out.println("File not found."); 

        } 
    } 
}