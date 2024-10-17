// 7. String Operations 

import java.util.Scanner; 

public class StringOperations { 
    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter a string: "); 
        String input = scanner.nextLine(); 
        String upperCase = input.toUpperCase(); 
        int length = input.length(); 
        String substring = input.substring(2, 5); // From index 2 to 4 
        
        System.out.println("Uppercase: " + upperCase); 
        System.out.println("Length: " + length); 
        System.out.println("Substring (3rd to 5th char): " + substring); 
    } 
}