//print range of number is armstrong or not

import java.util.Scanner;
class RangeOfArmStrongNumber{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter first number");
       int start=sc.nextInt();
	   System.out.println("Enter ending number");
	   int end=sc.nextInt();
	   
	   for(;start<=end;start++){
	      int len=0;
	      for(int i=start;i!=0;i/=10)
		  {
		     len++;
		  }
		    int sum=0;
		  for(int i=start;i!=0;i/=10){
		     int last=i%10;
			 
			 int pow=1;
			 for(int j=1;j<=len;j++){
			     pow=pow*last;
				// System.out.println(pow);
			 }
			 sum=sum+pow;
			 //.out.println(sum);
		  }
		  if(sum==start){
		     System.out.println(start);
		  }
	   }
   }
}