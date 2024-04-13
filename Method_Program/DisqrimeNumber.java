/*
class DisqrimeNumber{
     public static void main(String[] args){
	     int num=89;
		 if(isDisqrime(num)){
		     System.out.println("It is Disqrime Number");
		 }
		 else{
		     System.out.println("It is not Disqrime Number");
		 }
	 }
	 public static boolean isDisqrime(int num){
	     int ct=count(num);
		 int sum=0;
		 for(int i=num;i!=0;i/=10){
		     int digit=i%10;
			 sum=sum+power(ct,digit);
			 ct--;
		 }
		 return sum==num;
	 }
	 public static int count(int num){
	     int ct=0;
		 
		 for(int i=num;i!=0;i/=10){
		    ct++;
		 }
		 return ct;
	 }
	 public static int power(int ct,int rem){
	    int pow=1;
		for(int i=0;i<ct;i++){
		   pow=pow*rem;
		}
		return pow;
	 }
}*/

class DisqrimeNumber{
   public static void main(String []args){
	    int start=1;
		int end=200;
		while(start<=end){
			if(isDisqrime(start)){
				System.out.println(start);
			}
			start++;
		}
   }
   public static boolean isDisqrime(int num){
	   int count=count(num);
	   int sum=0;
	   for(int i=num;i!=0;i/=10){
		   int digit=i%10;
		   sum=sum+power(digit,count); 
		   count--;
	   }
	   return sum==num;
   }
   public static int count(int num){
	   int ct=0;
	   for(int i=num;i!=0;i/=10){
		   ct++;
	   }
	   return ct;
   }
   public static int power(int rem,int ct){
	   int pow=1;
	   for(int i=1;i<=ct;i++){
		   pow=pow*rem;
	   }
	   return pow;
   }
   
}