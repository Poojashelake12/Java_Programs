//check given number is perfect or not if it is perfect the check it is palindrome or not.if it is not perfect number then find the sum of digit

import java.util.Scanner;
class perfectPalindromeNumber{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int num=sc.nextInt();
	 int sum=0;
	 for(int den=1;den<=num/2;den++){
	    if(num%den==0){
		    sum+=den;
		}
	 }
	 System.out.println(sum);
	 if(sum==num){
	    int rev=0;
		for(int i=num;i!=0;i/=10){
			rev=rev*10+(i%10);
		}
		if(num==rev){
			System.out.println("it is perfect and also palindrome number");
		}
		else{
			System.out.println("It is perfect number but not palindrome number");
		}
	 }
	 else{
		 
		 int total=0;
		 while(num!=0){
			 sum=sum+(num%10);
			 num/=10;
		 }
		 System.out.println("sum of digit in given number is"+sum);
	 }
   }
}