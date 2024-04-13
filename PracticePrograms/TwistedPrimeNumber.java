//check given number is twisted prime number or not


//using for loop
import java.util.Scanner;
class TwistedPrimeNumber{
    public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int num=sc.nextInt();
	   int den;
	   
	   for(den=2;den<num;den++){
	      if(num%den==0){
		     break;
		  }
	   }
	   if(num==den){
	      int rev=0;
	       for(int i=num;i!=0;i/=10){
		      rev=rev*10+(i%10);
		   }
		   for(den=2;den<rev;den++){
	       if(rev%den==0){
		     break;
		   }
	      }
		  if(rev==den){
		     System.out.println("It is twisted prime number");
		  }
		  else{
		    System.out.println("It is not twisted prime  number");
		  }
	   }
	   else{
	      System.out.println("It is not prime number");
	   }
	}
}