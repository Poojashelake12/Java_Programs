import java.util.Scanner;

class SumPrimeDigit{
    
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int num=sc.nextInt();
	   int sum=0;
	   for(int i=num;i!=0;i/=10){
	      int digit=i%10;
		  if(isPrime(digit)){
		     sum+=digit;
		  }
	   }
	   System.out.println(sum);
   }
   public static boolean isPrime(int num){
      int den;
	  for(den=2;den<=num;den++){
	     if(num%den==0){
		    break;
		 }
	  }
	   return num==den;
	      
   }
}