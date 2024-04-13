//find the range of strong number

import java.util.Scanner;
class RangeOfStrongNumber{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter starting number");
	 int start=sc.nextInt();
	 System.out.println("Enter the ending number");
	 int end=sc.nextInt();
	 
	 for(int i=start;i<=end;i++){
	     int sum=0;
		   start=i;
		 for(int j=start;j!=0;j/=10){
		    int digit=j%10;
			
			int fact=1;
			for(int k=1;k<=digit;k++){
			    fact*=k;
			}
			sum=sum+fact;
		 }
		 if(sum==start){
		     System.out.println(start);
		 }
		 
	 }
	 
	 
   }
}