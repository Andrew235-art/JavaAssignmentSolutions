// 10. Using HashMap with Generics 

import java.util.HashMap; 

public class HashMap { 
    public static void main(String[] args) { 

        HashMap<String, Integer> studentScores = new HashMap<>(); 
        
        studentScores.put("Alice", 85); 
        studentScores.put("Bob", 90); 
        studentScores.put("Charlie", 78); 
        
        for (String name : studentScores.keySet()) { 
            System.out.println(name + ": " + studentScores.get(name)); 
        } 
    } 
}