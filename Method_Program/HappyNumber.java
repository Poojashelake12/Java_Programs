
class HappyNumber{
    public static void main(String[] args){
	  int num=4;
	  
	  while(true){
		  num=sumSqDigit(num);
	    if(num==1 || num==4){
	      break;
	    }
	  }
	  if(num==1){
	     System.out.println("It is Happy Number");
	  }
	  else if(num==4){
	     System.out.println("It is not Happy Number");
	  }
	   
	}
	
	public static int sumSqDigit(int num){
	     int sum=0;
		 while(num!=0){
		    int last=num%10;
			sum+=(last*last);
			num/=10;
		 }
		 //System.out.println(sum);
		 return sum;
	}
}