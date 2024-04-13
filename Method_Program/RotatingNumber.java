class RotatingNumber{
     public static void main(String[] args){
	    
		System.out.println(rotate(1234));
		System.out.println(rotate(123));
	 }
	 public static int rotate(int num){
		  int ans=0;
		 
			
		    int last=num%10;
			int ct=count(num);
		     int remainingNumber=num/10;
			 
		     ans=last*power(10,ct-1)+remainingNumber;
	     
		 return ans;
	 }
	 public static int count(int num){
	     int ct=0;
		 for(int i=num;i!=0;i/=10){
		    ct++;
		 }
		 return ct;
	 }
	 public static int power(int rem,int count){
	      int pow=1;
		  for(int i=0;i<count;i++){
		      pow=pow*rem;
		  }
		  return pow;
	 } 
	 
}