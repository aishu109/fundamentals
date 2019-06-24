package aishu;

public class Thirteen {

public static void main(String[] args) {
// TODO Auto-generated method stub
int p=0;

for( int i=10;i<=99;i++)
   {  

  for(int j=1;j<=i;j++)
   {
 if(i%j==0)
 p+=1;
   }
 if(p==2)
  System.out.println(i);
  else
  p=0;
}
   }
}


