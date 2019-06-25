package flowControl;


public class Three {

public static void main(String[] args)
{
 if(args.length==0)
 {
	 System.out.println("no values" );
 }
 else
 { 
	 int size=args.length;
	 for(int i =0;i<size;i++)
	 {
		 if(i==size-1)
	   System.out.println(args[i]);
		 else
			 System.out.print(args[i]+",");
 }
 
	}
}
}

