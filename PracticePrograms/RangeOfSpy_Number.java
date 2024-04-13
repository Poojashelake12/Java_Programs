//find range of spy-number(sum-product are same)

import java.util.Scanner;
class RangeOfSpy_Number{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter starting number");
	  int start=sc.nextInt();
	  System.out.println("Enter ending number");
	  int end=sc.nextInt();
	  
	  for(;start<=end;start++){
	    int sum=0;
		int product=1;
	     for(int i=start;i!=0;i/=10){
		    int digit=i%10;
			sum=sum+digit;
			product=product*digit;
		 }
		 if(sum==product){
		    System.out.println(start);
		 }
	  }
   }
}