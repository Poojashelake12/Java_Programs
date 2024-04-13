//find the sum of factor and product of factor are same or not

import java.util.Scanner;

class SumOfFactorProductOfFactorSameOrNot{
    public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num=sc.nextInt();
	  int sum=0,div=1,product=1;
	  while(div<=num){
	     if(num%div==0){
		    sum+=div;
			product*=div;
			//num/=10;
		 }
		 System.out.println(sum+" "+product);
		 div++;
		 
	  }
	  System.out.println(sum+" "+product);
	  if(sum==product){
	    System.out.println("Sum of digit and product of factor are same");
	  }
	  else{
	    System.out.println("Sum of digit and product of factor are not same");
	  }
	}
}