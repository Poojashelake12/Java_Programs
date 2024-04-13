
class RangeOfHappyNumber{
    
	public static int sumSqurDigit(int num){
	    int sum=0;
	    while(num!=0){
		   int last=num%10;
		   sum+=(last*last);
		   num/=10;
		}
		return sum;
	}
	public static boolean isHappy(int num){
	    while(true){
		   num=sumSqurDigit(num);
		   if(num==1 || num==4){
		       break;
		   }
		}
		return num==1;
	}
    public static void main(String[] args){
	     int start=1;
		 int end=100;
		 
		 while(start<=end){
		    if(isHappy(start)){
			   System.out.println(start);
			}
			start++;
		 }
		 
		 
	}
	
}