
/*
class ReputePrimeNumber{
     public static void main(String[] args){
	       int num=11;
		   if(isReputePrime(num)){
			   System.out.println("it is Repute number");
		   }
		   else{
			   System.out.println("it is not Repute number");
		   }
	 }
	 public static boolean isReputePrime(int num){
	       String bin=" ";
		   int ct=0;
		  if(isPrime(num)){
		   while(num!=0){
		       int rem=num%2;
			   if(rem==1){
			      ct++;
			   }
			   bin=rem+bin;
			   num/=2;
		   }
		  }
		   return ct>=3;
	 }
	 public static boolean isPrime(int num){
	     for(int i=2;i<num;i++){
		     if(num%i==0){
			   return false;
			 }
		 }
		 return true;
	 }
}*/

//range of repute number

class ReputePrimeNumber{
	public static void main(String[] args){
		int start=1;
		int end=100;
		while(start<=end){
			if(isReputePrime(start)){
				System.out.println(start);
			}
			start++;
		}
	}
	 public static boolean isReputePrime(int num){
	       String bin=" ";
		   int ct=0;
		  if(isPrime(num)){
		   while(num!=0){
		       int rem=num%2;
			   if(rem==1){
			      ct++;
			   }
			   bin=rem+bin;
			   num/=2;
		   }
		  }
		   return ct>=3;
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
