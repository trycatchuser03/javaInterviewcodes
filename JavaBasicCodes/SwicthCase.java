package JavaBasicCodes;

import java.util.Scanner;

public class SwicthCase {

   public static void choiceenum(Shapes shape) {
     switch(shape) {
     case Circle:
    	 System.out.println(shape+" has no edges");
    	 break;
     case Triangle:
    	 System.out.println(shape+" has 3 edges");
    	 break;
     case Square:
    	 System.out.println(shape+" has 4 edges");
    	 break;
     case Pentagon:
    	 System.out.println(shape+" has 5 edges");
    	 break;
     default: 
    	 System.out.println("someting went wrong");
     }
   }
   
   public static void choiceown(String shape) {
	     switch(shape) {
	     case "circle":
	    	 System.out.println(shape+" has no edges");
	    	 break;
	     case "Triangle":
	    	 System.out.println(shape+" has 3 edges");
	    	 break;
	     case "Rectangle":
	    	 System.out.println(shape+" has 4 edges");
	    	 break;
	     case "Pentagon":
	    	 System.out.println(shape+" has 5 edges");
	    	 break;
	     default: 
	    	 System.out.println("someting went wrong");
	     }
	   }
    
    	 
    public static void main(String[] args) {
	   
       choiceenum(Shapes.Square);
	   System.out.println("Enter your choice ");
	   Scanner sc = new Scanner(System.in);
	   choiceown(sc.next());
	   
   }

}
