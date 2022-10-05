package java_basic;
import java.util.Scanner;
public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		visitIsland("Corfu");
		 
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
	 
	
	

}

