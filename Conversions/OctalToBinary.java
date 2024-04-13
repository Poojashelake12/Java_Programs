

class OctalToBinary{
     public static void main(String[] args){
	    int num=7;
		System.out.println(octToBin(num));
	
	 }
	 public static String octToBin(int num){
	     String ans="";
		 while(num!=0 && num>=1&&num<=7){
		    int rem=num%2;
			ans=rem+ans;
			num/=2;
		 }
		 return ans;
	 }
}