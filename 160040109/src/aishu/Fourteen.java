package aishu;
import java.util.Scanner;
public class Fourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		boolean p=true;
		System.out.println("please enter the number");
		int y=s.nextInt();
		if(y==0)
			System.out.println("It is niether prime nor composite");
		else
		{
		for(int i=2;i<y;i++)
		{
			if(y%i==0)
			{
				p=false;
				break;
			}
		}
       if(p)
    	   System.out.println(y+" is prime");
       else
    	   System.out.println(y+" is composite");
	}

}
}
