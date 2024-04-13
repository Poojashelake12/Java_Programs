class Xylem_phloemNumber{
   public static void main(String[] args){
     int num=1314;
        if(isXylem_phloemNumber(num)){
			System.out.println("it is Xylem_phloemNumber");
		}
		else{
			System.out.println("it is not Xylem_phloemNumber");
		}
   }
   public static boolean isXylem_phloemNumber(int num){
      int sum1=0;
	  
	  int sum2=0;
	  sum1+=num%10;
	  num/=10;
	  int ct=count(num);
	  for(int i=1;i<ct;i++){
	        sum2+=num%10;
			num/=10;
	  }
	  sum1+=num%10;
	  return sum2==sum1;
   }
   public static int count(int num){
	   int ct=0;
	   for(int i=num;i!=0;i/=10){
		   ct++;
	   }
	   return ct;
   }
}