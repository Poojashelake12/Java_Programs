//check given number is twisted prime number or not
//using  while loop

import java.util.Scanner;
class TwistedPrimeNumberUsingWhileLoop{
    public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num=sc.nextInt();
	  int den=2;
	  
	  while(den<num){
	     if(num%den==0){
		    break;
		 }
		 den++;
		 //System.out.println(num);
	  }
	  System.out.println(num+" "+den);
	  if(num==den){
	     int rev=0;
		 int temp=num;
		 while(temp!=0){
		   rev=rev*10+(temp%10);
		   temp/=10;
		 }
		 
		 den=2;
		 while(den<rev){
			 if(rev%den==0){
				 break;
			 }
			 den++;
		 }
		 System.out.println(rev+" "+den);
		 if(rev==den){
		     System.out.println("It is twisted prime number");
		  }
		  else{
		    System.out.println("It is not twisted prime number");
		  }
	  }
	  else{
		  System.out.println("It is not prime number");
	  }
	  
	}
}