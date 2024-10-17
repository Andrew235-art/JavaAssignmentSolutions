// 6. Array Manipulation 

public class ArrayManipulation { 
    public static void main(String[] args) { 
        int[] scores = {85, 90, 78, 92, 88}; 
        int sum = 0; int highest = scores[0]; 
        int lowest = scores[0]; 
        
        for (int score : scores) { 

            sum += score; 

            if (score > highest) highest = score; 
            
            if (score < lowest) lowest = score; 
        } 
            
        double average = sum / (double) scores.length; 
        
        System.out.println("Average Score: " + average); 
        System.out.println("Highest Score: " + highest); 
        System.out.println("Lowest Score: " + lowest); 
    } 
}