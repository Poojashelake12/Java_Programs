import java.util.Scanner;

class PrimeNumber1{
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		 if(isPrime(num)){
		      System.out.println("It is prime number");
		 }
		 else{
		    System.out.println("It is not prime number");
		 }
	}
	
	public static boolean isPrime(int num){
		int div;
	    for(div=2;div<=num;div++){
		   if(num%div==0){
		      break;
		   }
		   
		}
		if(num==div)
		    return true;
		else
		    return false;
	}
}