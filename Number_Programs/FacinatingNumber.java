/*
class FacinatingNumber{
    public static void main(String[] args){
	  int num=192;
	  int m1=0,m2=0,ans1=0,final_ans=0,ct1=0,ct2=0;
	     ct1=count(num);
	   if(ct1>=3)
		 m1=num*2;
		ans1=num*(power(10,ct1))+m1;
		ct2=count(m1);									
		 m2=num*3;
		final_ans=ans1*(power(10,ct2))+m2;
		System.out.println(final_ans);
		if(isUnique(final_ans)){
			System.out.println("it is FacinatingNumber ");
		}
		else{
			System.out.println("it is not FacinatingNumber ");
		}
	  }
	  public static boolean isUnique(int num){ 
      
		while(num!=0){
			int temp=num;
			int last=temp%10;
			 temp/=10;
			if(last==0){
				return false;
			}
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
	   for(int i=1;i<=count;i++){
	      pow*=rem;
	   }
	   return pow;
	}
	
}*/


//range
class FacinatingNumber{
	public static void main(String[] args){
		int start=1;int end=500;
		while(start<=end){
			if(isFacinating(start)){
				System.out.println(start);
			}
			start++;
		}
	}
	public static boolean isFacinating(int num){
		int ct=count(num);
		int ans=0;
		if(ct>=3){
			int m1=num*2;
			ans=num*power(10,count(m1))+m1;
			int m2=num*3;
			
			ans=ans*power(10,count(m2))+m2;
		}
		return isUnique(ans);
	}
	public static boolean isUnique(int num){
		while(num!=0){
			int temp=num;
			int last=temp%10;
			temp/=10;
			if(last==0){
				return false;
			}
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
	}
	public static int count(int num){
		int ct=0;
		for(int i=num;i!=0;i/=10){
			ct++;
		}
		return ct;
	}
	public static int power(int num,int count){
		 int pow=1;
		 for(int i=1;i<=count;i++){
			 pow*=num;
		 }
		 return pow;
	}
	
}