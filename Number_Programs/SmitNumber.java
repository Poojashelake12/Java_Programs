/*class SmitNumber{
    public static void main(String[] args){
		int num=85;
	     if(isSmit(num)){
		    System.out.println("It is Smit number");
		 }
		 else{
		    System.out.println("It is not Smit number");
		 }
	}
	public static boolean isSmit(int num){
	    int sum=digitSum(num);
		int primefactorsum=sumOfPrimeFactor(num);
		System.out.println(primefactorsum);
		System.out.println(sum);
	    return sum==primefactorsum;
	}
	public static int digitSum(int num){
	    int sum=0;
		for(int i=num;i!=0;i/=10){
		   sum+=(i%10);
		   
		}
		
		return sum;
	}
	public static int sumOfPrimeFactor(int num){
	     int den=2;
		 int sum=0;
		 while(num!=1){
			 //System.out.println(num%den==0);
		   if(num%den==0){
				 
			   num/=den;
			 
			 //System.out.println(isPrime(den));
			 if(isPrime(den)){
				 
			   sum+=digitSum(den);
			  // System.out.println(digitSum(den));
			   den=2;
			 }
			 
		   }
		   else{
				 den++;
			 }
		 }
		 //System.out.println(sum);
		   
		 return sum;
	}
	public static boolean isPrime(int num){
	     for(int den=2;den<num;den++){
		      if(num%den==0){
			      return false;
			  }
		 }
		 return true;
	}
}*/


//range of smit number

class SmitNumber{
	public static void main(String[] args){
		int start=1;
		int end=500;
		while(start<=end){
			if(isSmit(start)){
				System.out.println(start);
			}
			start++;
		}
		
	}
	public static int sumOfDigit(int num){
		int sum=0;
		for(int i=num;i!=0;i/=10){
			sum+=(i%10);
		}
		return sum;
	}
	public static int sumOfFactorDigit(int num){
		int den=2;
		int sum=0;
		while(num!=1){
			if(num%den==0){
				num/=den;
				if(isPrime(den)){
					sum+=sumOfDigit(den);
					
				}
				den=2;
				
			}
			else{
					den++;
				}

		}
		return sum;
	}
	public static boolean isPrime(int num){
		for(int i=2;i<num;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	public static boolean isSmit(int num){
		int sum=sumOfDigit(num);
		int factoFSum=sumOfFactorDigit(num);
		//System.out.println(sum+""+factoFSum);
		return sum==factoFSum;
	}
}