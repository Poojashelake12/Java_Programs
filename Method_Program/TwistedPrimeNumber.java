import java.util.Scanner;

class TwistedPrimeNumber{
     public static void main(String[] args){
	      Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number");
		  int num=sc.nextInt();
		  if(isPrime(num)){
		     int rev=reverse(num);
			 if(isPrime(rev)){
			    System.out.println("It is twisted prime number");
			 }
			 else{
			    System.out.println("It is not twisted prime number");
			 }
		  }
		  else{
		     System.out.println("It is not prime number");
		  }
	 }
	 public static int reverse(int num){
	    int rev=0;
		for(int i=num;i!=0;i/=10){
		    rev=rev*10+(num%10);
		}
		return rev;
	 }
	 public static boolean isPrime(int num){
	     int den;
		 for(den=2;den<=num;den++){
		    if(num%den==0){
			    break;
			}
		 }
		 if(den==num)
		    return true;
		 else
		    return false;
	 }
}