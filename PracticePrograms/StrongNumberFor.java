//check given number is strong or not

import java.util.Scanner;
class StrongNumberFor{
    public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int num=sc.nextInt();
	   int sum=0;
	   
	   for(int i=num;i!=0;i/=10){
	       int digit=i%10;
		   
		   int fact=1;
		   for(int j=1;j<=digit;j++){
		       fact*=j;
		   }
		   sum+=fact;
	   }
	   if(sum==num){
	      System.out.println("It is strong number");
	   }
	   else{
	      System.out.println("It is not strong number");
	   }
	}
}