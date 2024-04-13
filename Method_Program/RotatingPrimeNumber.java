class RotatingPrimeNumber{
    public static void main(String[] args){
	    int num=13;
		int temp=num;
		if(isPrime(num)){
		   num=rotate(num);
		  while(temp!=num){
		    if(!isPrime(num)){
			    break;
			}
			num=rotate(num);
		  }
		   if(temp==num){
		      System.out.println("It is rotating prime number");
		  }
		  else{
		     System.out.println("It is not rotating prime number");
		  }
		}
		else{
		   System.out.println("It is not prime number");
		}
	}
	public static int rotate(int num){
	    return (num%10)*power((num%10),count(num))+(num/10);
	}
	public static boolean isPrime(int num){
	      for(int i=2;i<num;i++){
		      if(num%i==0){
			      return false;
			  }
		  }
		  return true;
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
		for(int i=0;i<ct;i++){
		   pow*=rem;
		}
		return pow;
	}
}