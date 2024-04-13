
//not working
class WeirdNumber{
    public static void main(String[] args){
	    int num=40;
		if(isWeird(num)){
		   System.out.println("It is Weird Number");
		}
		else{
		   System.out.println("It is not Weird Number");
		}
	}
	public static boolean isWeird(int num){
		System.out.println(FactorSum(num)>num);
	   return  FactorSum(num)>num;
	}
	public static int FactorSum(int num){
	    int div,sum=0;
	    for(div=1;div<num;div++){
		   if(num%div==0){
			   System.out.println(div);
		     sum+=div;
		   }
		  
		}
		 System.out.println(sum);
		return sum;
	}
}


//range of weird Number
/*
class WeirdNumber{
	
	public static void main(String[] args){
		int start=1;
		int end=100;
		while(start<=end){
			if(isWeird(start)){
				System.out.println(start);
			}
			start++;
		}
	}
	public static boolean isWeird(int num){
		 return sumFactor(num)>num;
	}
	public static  int sumFactor(int num){
		
		int sum=0;
		for(int div=1;div<num;div++){
			if(num%div==0){
				sum+=div;
			}
		}
		//System.out.println("sum: "+sum);
		return sum;
	}
}*/