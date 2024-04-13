

class RangeRoatatingPrime{
     public static void main(String[] args){
	     int num=13;
		 if(isRoatatingPrime(num)){
			 System.out.println("it is RoatatingPrime number");
		 }
		 else{
			 System.out.println("it is not RoatatingPrime number");
		 }
		 
	 }
	 public static boolean isRoatatingPrime(int num){
		   if(num==1){
			   return false;
		   }
	      if(isPrime(num)){
		       int rot=rotate(num);
			   System.out.println(rot);
			   if(isPrime(rot)){
				   
			        return true;
			   }
		  }
		  return false;
	 }
	 public static int rotate(int num){
	     return ((num%10)*power(10,count(num)-1)+num/10);
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
	 public static int power(int base,int raise){
	     int pow=1;
	     for(int i=1;i<=raise;i++){
		    pow*=base;
		 }
		 //System.out.println(pow+" "+raise);
		 return pow;
	 }
}










/*int start=100;
		 int end=120;
		 while(start<=end){
		     if(isRoatatingPrime(start)){
			    System.out.println(start);
			 }
			 start++;
		 }*/