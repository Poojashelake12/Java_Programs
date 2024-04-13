class DeficientNumber{
    public static void main(String[] args){
	   int num=6;
	    if(isDeficientNumber(num)){
		   System.out.println("It is DeficientNumber");
		}
		else{
		   System.out.println("It is not DeficientNumber");
		}
	}
	public static boolean isDeficientNumber(int num){
	   int sum=factorSum(num);
	   return sum<num;
	}
	public static int factorSum(int num){
	   int sum=0;
	   for(int den=1;den<num;den++){
	     if(num%den==0){
		    sum+=den;
		 }
	      
	   }
	   return sum;
	}
}