//check the given number is palindrome or not

import java.util.Scanner;
class PalindromeOrNot{
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int temp=num;
		int rev=0;
		while(temp>0){
		   int rem=temp%10;
		   rev=rev*10+rem;
		   temp/=10;
		}
		if(num==rev){
		   System.out.println("It is palindrome number");
		}
		else{
		   System.out.println("It is not palindrome number");
		}
	}
}