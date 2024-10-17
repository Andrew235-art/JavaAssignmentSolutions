// 5. Method Overloading 

public class MethodOverloading { 
    public static void main(String[] args) { 
        greetUser("John"); 
        greetUser(); // Guest greeting 
    } 
    
    public static void greetUser(String name) { 
        System.out.println("Hello, " + name + "!"); 
    } 
    
    public static void greetUser() { 
        System.out.println("Hello, Guest!"); 
    } 
}