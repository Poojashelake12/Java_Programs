//Strong number
class KrishanMurthiNumber{
    public static void main(String[] args){
	   int num=145;
	   //int sum=sum(num);
	   if(isStrong(num)){
	      System.out.println("It is KrishanMurthi number");
	   }
	   else{
	       System.out.println("It is not KrishanMurthi number");
	   }
	   
	}
	public static boolean isStrong(int num){
		//System.out.println(sum(num));
	     return sum(num)==num;
	}
	public static int sum(int num){
	    int sum=0;
	   for(int i=num;i!=0;i/=10){
	      int digit=i%10;
		 // System.out.println(digit);
		  sum+=factorial(digit);
	   }
	   //System.out.println(sum);
	   return sum;
	}
	public static int factorial(int num){
	   int fact=1;
	   for(int i=1;i<=num;i++){
	       fact*=i;
	   }
	   //System.out.println("fact"+fact);
	   return fact;
	}
}