package aishu;
import java.util.*;
public class Eighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=s.nextInt();
		int z=0;
		int t=n;
		while(t>0)
		{
			z=(z*10)+(t%10);
			t=t/10;
		}
		if(n==z)
			System.out.println(n+" is palindrome");
		else
			System.out.println(n+" is not  palindrome");
		}

}
