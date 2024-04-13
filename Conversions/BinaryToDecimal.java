

class BinaryToDecimal{
     public static void main(String[] args){
	     int num=101;
		 System.out.println(BinToDec(num));
		 
	 }
	 public static int BinToDec(int num){
	      int ans=0;
		  for(int i=0;num!=0;i++,num/=10){
			  int rem=num%10;
			  ans= rem*power(2,i)+ans;
			  //num/=2;
		  }
		 return ans;
	 }
	 public static int power(int num,int ct){
		 int pow=1;
		 for(int i=1;i<=ct;i++){
			 pow=pow*num;
		 }
		 return pow;
	 }
	 
}