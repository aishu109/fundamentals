package aishu;

public class Thirteen2 {

public static void main(String[] args) {
// TODO Auto-generated method stub
	for(int i=19; i < 99; i++){

        boolean isPrime = true;

        //check to see if the number is prime
        for(int j=2; j < i ; j++){

                if(i % j == 0){
                        isPrime = false;
                        break;
                }
        }
        // print the number
        if(isPrime)
                System.out.print(i + " ");
}
   }
}


