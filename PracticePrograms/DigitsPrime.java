//check if the given number all the digits are prime or not

import java.util.Scanner;
class DigitsPrime{
    public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int num=sc.nextInt();
	   
	   while(num!=0){
	      int digit=num%10;
		  
		  if(digit!=2 && digit!=3 && digit!=5 && digit!=7){
		     break;
		  }
		  num/=10;
	   }
	   if(num==0){
	      System.out.println("It is prime number");
	   }
	   else{
	      System.out.println("It is not prime number");
	   }
	}
}