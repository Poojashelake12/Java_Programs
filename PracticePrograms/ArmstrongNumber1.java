//check given number is armstrong or not

import java.util.Scanner;
class ArmstrongNumber1{
    public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int num=sc.nextInt();
	   
	   int len=0;
	   for(int i=num;i!=0;i/=10){
	      len++;
	   }
	   int sum=0;
	   for(int i=num;i!=0;i/=10){
	       int last=i%10;
		   
		   int pow=1;
		   for(int j=1;j<=len;j++){
		     pow=pow*last;
		   }
		   sum=sum+pow;
	   }
	   if(sum==num){
	      System.out.println("It is Armstrong Number");
	   }
	   else{
	       System.out.println("It is not Armstrong Number");
	   }
	}
}