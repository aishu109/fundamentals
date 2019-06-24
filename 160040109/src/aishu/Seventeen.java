package aishu;
import java.util.*;
public class Seventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=s.nextInt();
		int z=0;
		while(n>0)
		{
			z=(z*10)+(n%10);
			n=n/10;
		}
		System.out.println(z);
		}

}
