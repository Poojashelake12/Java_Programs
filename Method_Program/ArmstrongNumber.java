/*
class ArmstrongNumber{
     public static void main(String[] args){
	     int num=153;
	    if(isArmstrong(num)){
		   System.out.println("It is armstrong number");
		}
		else{
		    System.out.println("It is not armstrong number");
		}
	 }
	 public static boolean isArmstrong(int num){
	    int ct=count(num);
		int sum=0;
		for(int i=num;i!=0;i/=10){
		   int digit=(i%10);
		   sum=sum+power(ct,digit);
		}
		return num==sum;
	 }
	 public static int count(int num){
	     int ct=0;
		 System.out.println(num);
		 for(int i=num;i!=0;i/=10){
		    ct++;
			//System.out.println("count"+ct);
			//System.out.println("i"+i);
			//i/=10;
		 }
		 
		 return ct;
	 }
	 public static int power(int count,int rem){
	     int pow=1;
		 for(int i=0;i<count;i++){
		    pow*=rem;
		 }
		 //System.out.println("power"+pow);
		 return pow;
	 }
}*/


//range of armstrong number

class ArmstrongNumber{
	public static void main(String[] args){
		int start=1;
		int end=1000;
		while(start<=end){
			if(isArmstrong(start)){
				System.out.println(start);
			}
			start++;
		}
	}
	public static int count(int num){
		int ct=0;
		
		for(int i=num;i!=0;i/=10){
			ct++;
		}
		return ct;
	}
	public static int power(int rem,int count){
		int pow=1;
		for(int i=0;i<count;i++){
			pow*=rem;
		}
		return pow;
	}
	public static boolean isArmstrong(int num){
		int ct=count(num);
		int sum=0;
		for(int i=num;i!=0;i/=10){
			int digit=i%10;
			sum=sum+power(digit,ct);
		}
		return sum==num;
	}
}