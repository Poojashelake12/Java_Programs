class GoodNumber{
    public static void main(String[] args){
	   int num=36;
	   if(isGood(num)){
	       System.out.println("It is Good number");
	   }
	   else{
	       System.out.println("It is not Good number");
	   }
	}
	public static boolean isGood(int num){
	   for(int i=num;i!=0;i/=10){
	      int digit=i%10;
		  if(num%digit!=0){
		     return false;
		  }
	   }
	   return true;
	}
}