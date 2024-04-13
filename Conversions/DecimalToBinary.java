

class DecimalToBinary{
     public static void main(String[] args){
	    int num=5;
		System.out.println(DecToBin(num));
	 }
	 public static String DecToBin(int num){
	      String ans="";
	     for(int i=num;i!=0;i/=2){
		      int rem=i%2;
			  ans=rem+ans;
		  }
		  return ans;
	 }
}