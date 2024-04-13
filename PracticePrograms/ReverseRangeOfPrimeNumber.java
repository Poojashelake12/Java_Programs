//print reverse range of prime number

import java.util.Scanner;
class ReverseRangeOfPrimeNumber{
     public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter starting number");
	   int start=sc.nextInt();
	   System.out.println("Enter ending number");
	   int end=sc.nextInt();
	   
	   while(start>=end){
	      int den=2;
		  while(den<start){
		     if(start%den==0){
			    break;
			 }
			 den++;
		  }
		  if(den==start){
		     System.out.println(start);
		  }
		  start--;
	   }
	 }
}