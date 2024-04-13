//count the even and odd digit from given number

import java.util.Scanner;
class EvenOddCount{
    public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter the number");
	   int num=sc.nextInt();
	   int countEven=0,countOdd=0;
	   
	   while(num>0){
	      int digit=num%10;
		  if(digit%2==0){
		     countEven++;
		  }
		  else{
		     countOdd++;
		  }
		  num/=10;
	   }
	   System.out.println("Even digit count:"+countEven);
	    System.out.println("Odd digit count:"+countOdd);
	}
}