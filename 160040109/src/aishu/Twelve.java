package aishu;
import java.util.*;
public class Twelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int p=0;
      int c=s.nextInt();
      for(int i=1;i<=c;i++)
      {
    	if(c%i==0)
    		p++;
    	
      }
      if(p==2)
  		System.out.println(" prime number");
  	else
  		System.out.println("not prime number");
	}

}
