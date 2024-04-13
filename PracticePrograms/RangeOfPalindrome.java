//range of palindrome number

import java.util.Scanner;
class RangeOfPalindrome{
    public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the starting number");
	  int start=sc.nextInt();
	  System.out.println("Enter the ending number");
	  int end=sc.nextInt();
	  
	   for(; start<=end;start++){
	        int rev=0;
			for(int i=start;i!=0;i/=10){
			    rev=rev*10+(i%10);
			}
			if(start==rev){
			    System.out.println(start);
			}
	   }
	}
}