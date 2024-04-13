
class UniqueNumber{
	
    public static boolean isUnique(int num){
	    while(num!=0){
	       int temp=num;
		    int last=temp%10;
		    temp/=10;
		  while(temp!=0){
		   if(last!=temp%10){
		      temp/=10;
		   }
		   else{
			  break; 
		   }
		   
		  }
		if(temp!=0){
		    break;
		}
		num/=10;
	 }
	 return num==0;
	 /*if(num==0){
		   System.out.println("It is Unique Number");
		}
		else{
		   System.out.println("It is not Unique Number");
		}*/
	}
	
	public static void main(String[] args){
	    int num=12334;
		
		//System.out.println(isUnique(num););
		if(isUnique(num)){
		   System.out.println("It is Unique Number");
		}
		else{
		   System.out.println("It is not Unique Number");
		}
	}
	
	 
}
