class PrimeNumber{
    public static void main(String[] args){
	  isPrime(14 );
	}
     
    public static void isPrime(int num){
	   int div;
	   for( div=2;div<=num;div++){
	      if(num%div==0){
		       break;
		  }
	   }
	   if(num==div){
	      System.out.println("It is prime");
	   }
	   else{
	     System.out.println("It is not prime");
	   }
	}	 
}