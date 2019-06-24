package aishu;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='a';
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
		{
      System.out.println("alphabet");
	}
		else if(c>=0||c<=9)
			System.out.println("Digit");
		else
			System.out.println("special character");
			

}
}
