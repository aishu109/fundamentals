package aishu;

public class Seven2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char c='z';
       int  temp=(int)c;
       if(c>='a'&&c<='z')
       {
          temp=temp-32;
       }
       else
    	   temp=temp+32;
       c=(char)temp;
       System.out.println(c);
	} 
	
}
    