
class HammingNumber_OR_UgglyNumber{
     public static void main(String[] args){
	    int num=10;
		if(isHamming(num)){
		   System.out.println("It is HammingNumber_OR_UgglyNumber");
		}
		else{
		   System.out.println("It is not HammingNumber_OR_UgglyNumber");
		}
	 }
	 public static boolean isHamming(int num){
	      while(true){
			  
			   if(num%2==0){
				   num/=2;
			   }
			   else if(num%3==0){
				  num/=3;
			   }
			   else if(num%5==0){
				   num/=5;
			   }
			   else{
				   break;
			   }
		  }
		  return num==1;
	 }
		 
}*/

//range of hamming number
 class HammingNumber_OR_UgglyNumber{
	 public static void main(String[] args){
		 int start=1;
		 int end=100;
		 while(start<=end){
			 if(isHamming(start)){
				 System.out.println(start);
			 }
			 start++;
		 }
		 
		 
	 }
	 public static boolean isHamming(int num){
		 while(true){
			 if(num%2==0){
				 num/=2;
			 }
			 else if(num%3==0){
				 num/=3;
			 }
			 else if(num%5==0){
				 num/=5;
			 }
			 else{
				 break;
			 }
		 }
		 return num==1;
	 }
	 
 }
