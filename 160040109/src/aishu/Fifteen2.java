package aishu;
import java.util.*;
public class Fifteen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the number\n");
		int n=s.nextInt();
		int z=0;
	  for(;n>0;)
		{
			z=z+(n%10);
			n=n/10;
		}
	  System.out.println("the sum of the digits is\t"+z);
	}
}
