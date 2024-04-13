//check given number contain 0 or not

import java.util.Scanner;
class DuckNumberOrNot{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter the number");
	   int num=sc.nextInt();
	   int count=0;
	   while(num>0){
	      int digit=num%10;
		  if(digit==0)
		  {
		     count++;
             break;
		  }
		 num/=10;
	   }
	   if(count>=1){
	     System.out.println("It is a duck number");
	   }
	   else{
	      System.out.println("It is not a duck number");
	   }
	   
	   
	   
   }
}