package java_basic;
import java.util.*;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		
		boolean result = false;
		String id = "아담";
		
		Scanner sc1 = new Scanner(System.in);
				
		System.out.println("아이디:");
		
		id = sc1.nextLine();
	    result = id.equals("아담");
	    	
	    
	    System.out.println(result);
	    System.out.println();

			
		sc1.close();
	

		
	     		
	}//main class
	
	public static void visitIsland(String island){
		
	    switch(island) {
         
	     case "Corfu":
              System.out.println("User wants to visit Corfu");
              break;
              
         case "Crete":
              System.out.println("User wants to visit Crete");
              break;
         case "Santorini":
              System.out.println("User wants to visit Santorini");
              break;
         case "Mykonos":
              System.out.println("User wants to visit Mykonos");
              break;
        default:
              System.out.println("Unknown Island");
              break;
        }// switch
        
        
        
      }// close visit method
	
	public static void grading(String grade) {
		 
        int success;
        switch (grade) {
        case "A":
            System.out.println("Excellent grade");
            success = 1;
            break;
        case "B":
            System.out.println("Very good grade");
            success = 1;
            break;
        case "C":
            System.out.println("Good grade");
            success = 1;
            break;
        case "D":
        	      	
        	
        case "E":
        case "F":
            System.out.println("Low grade");
            success = 0;
            break;
        default:
            System.out.println("Invalid grade");
            success = -1;
            break;
        }
 
        passTheCourse(success);
 
    }//method
	
	public static void passTheCourse(int success) {
        switch (success) {
        case -1:
            System.out.println("No result");
            break;
        case 0:
            System.out.println("Final result: Fail");
            break;
        case 1:
            System.out.println("Final result: Success");
            break;
        default:
            System.out.println("Unknown result");
            break;
        }//switch
 
    }//method
	
	
	
	
	
	
	  
	 
	
	

}//class

