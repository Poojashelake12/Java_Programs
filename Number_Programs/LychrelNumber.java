/*
class LychrelNumber{
	   public static void main(String[] args){
		   int num=196;
		   if(isLychrel(num)){
		      System.out.println("It is Lychrel Number");
		   }
		   else {
		      System.out.println("It is not Lychrel Number");
		   }
	   }
	   public static boolean isLychrel(int num){
			 int sum=num+revrse(num);
			 return !isPalindrome(sum);
	   }
	   public static int revrse(int num){
		  int rev=0;
		  for(int i=num;i!=0;i/=10){
		     rev=rev*10+(i%10);
		  }
		  return rev;
	   }
	   public static boolean isPalindrome(int num){
	       return num==revrse(num);
	   }
	   
}*/

//range of LychrelNumber

class LychrelNumber{
     public static void main(String[] args){
		 int start=1;
		 int end=300;
		 while(start<=end){
			 if(isLychrel(start)){
				 System.out.println(start);
			 }
			 start++;
		 }
	 }
	 public static boolean isLychrel(int num){
		 int iteration =20;
	  for(int i=0;i<iteration;i++){
		  num=num+revrse(num);
		 if(isPalindrome(num)){
		     return false; 
		}
	  }
		 //System.out.println(sum);
		 //System.out.println(!isPalindrome(sum));
		 return true;
		 
	 }
	 public static int revrse(int num){
		 int rev=0;
		 for(int i=num;i!=0;i/=10){
			 rev=rev*10+(i%10);
		 }
		 return rev;
	 }
	 public static boolean isPalindrome(int num){
		 return num==revrse(num);
	 }
}

