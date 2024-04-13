class BouncyNumber{
    public static void main(String[] args){
	     int num=1231;
		 if(isBouncy(num)){
		     System.out.println("It is Bouncy Number");
		 }
		 else{
		    System.out.println("It is not Bouncy Number");
		 }
	}
	public static boolean isBouncy(int num){
	     boolean inc=false,dec=false;
		 
		 int last=num%10;
		 while(num>9){
		   num/=10;
		   int secLast=num%10;
		   
		   if(last>secLast){
		       dec=true;
		   }
		   else if(last<secLast){
		       inc=true;
		   }
		   if(inc && dec){
		      break;
		 }
		 else{
		    last=secLast;
		 }
		  
		 }
		 
		 return inc && dec;
	}
}*/

//it is not possible
class BouncyNumber{
	public static void main(String[] args){
		 int start=1;
		 int end=100;
		 while(start<=end){
			 if(isBouncy(start)){
				 System.out.println(start);
			 }
			 start++;
		 }
		
	}
	public static boolean isBouncy(int num){
		boolean inc=false,dec=false;
		
		int last=num%10;
		while(num>9){
		     num/=10;
			 int secLast=num%10;
			 if(last>secLast){
				 dec=true;
			 }
			 else if(last<secLast){
				 inc=true;
			 }
		     if(inc && dec){
				 break;
			 }
			 else{
				 last=secLast;
			 }
		}
		return inc && dec;
	}
}