//twisted prime number


class EmirpNumber{
    
	public static void main(String[] args){
	    int num=29;
	     if(isPrime(num)){
		      int rev=revrse(num);
		      if(isPrime(rev)){
			     System.out.println("It is EmirpNumber");
			  }
			  else{
			     System.out.println("It is not EmirpNumber");
			  }
		 }
		 else{
			 System.out.println("It is not prime number");
		 }
	}
	public static int revrse(int num){
	    int rev=0;
		for(int i=num;i!=0;i/=10){
		    rev=rev*10+(i%10);
		}
		return rev;
	}
	public static boolean isPrime(int num){
	   for(int i=2;i<num;i++){
	       if(num%i==0){
		      return false;
		   }
	   }
	   return true;
	}
}