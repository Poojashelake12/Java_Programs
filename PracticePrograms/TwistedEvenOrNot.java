//given number is twisted even number or not

import java.util.Scanner;
class TwistedEvenOrNot{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num=sc.nextInt();
	  
	  if(num%2==0){
	     System.out.println("It is even number");
		 System.out.println("Check it is twisted even number or not");
		 
		 int temp=num;
		 int rev=0;
		 while(temp>0){
		    int digit=temp%10;
			rev=rev*10+digit;
			temp/=10;
		 }
		 if(rev%2==0){
		   System.out.println(num+" number is twisted even number");
		 }
		 else{
		    System.out.println(num+" It is not twisted even number");
		 }
	  }
	  else{
	     System.out.println("It is not even number");
	  }
   }
}