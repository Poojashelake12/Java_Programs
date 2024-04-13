//find the range of prime number
//using for loop

import java.util.Scanner;
class RangeOfPrimeNumberFor{
    public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the starting number");
	   int start=sc.nextInt();
	   System.out.println("Enter the ending number");
	   int end=sc.nextInt();
	   
	   for(;start<=end;start++){
	   int den;
	      for(den=2;den<start;den++){
		      if(start%den==0){
			     break;
			  }
		  }
		  if(start==den){
		     System.out.println(start);
		  }
	   }
	   
	   
	   
	}
}