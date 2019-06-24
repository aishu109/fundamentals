package aishu;
import java.util.*;
public class Eight {
   public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       char c=s.next().charAt(0);
       switch(c)
       {
    	   case 'R':
    		    System.out.println("Red");
    		    break;
    	   case 'B':
   		    System.out.println("BLUE");
   		    break;
    	   case 'W':
   		    System.out.println("WHITE");
   		    break;
    	   case 'G':
   		    System.out.println("GREEN");
   		    break;
    	   case 'O':
   		    System.out.println("ORANGE");
   		    break;
    	   case 'Y':
   		    System.out.println("YELLOW");
   		    break;
    	   default:
    		   System.out.println("Invalid color");
       }
   }
}		   
    		   

