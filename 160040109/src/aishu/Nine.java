package aishu;
import java.util.Scanner;
public class Nine 
{
	public static void main(String ar[]) {
		Scanner s=new Scanner(System.in);
		int c=s.nextInt();
		switch(c)
		{
		case 1:
			System.out.println("jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("june");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("sep");
			break;
		case 10:
			System.out.println("oct");
			break;
		case 11:
			System.out.println("nov");
			break;
	    case 12:
				System.out.println("dec");
				break;
		default:
			  System.out.println("invalid character");
		}
		
	}

}
