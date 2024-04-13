
class MysteryNumber{
    public static void main(String[] args){
	int num=110;
	  if(isMystry(num)){
	      System.out.println("It is mystry number");
	  }
	  else{
	      System.out.println("It is not mystry number");
	  }
	}
	public static boolean isMystry(int num){
	    int n=11;
		while(true){
		    int rev=reverse(n);
			if(n+rev==num){
				System.out.println(n+" "+rev);
			     return true;
				 
			}
			else if(n+rev<num){
			   n++;
			}
			else{
			   break;
			}
		}
		return false;
	}
	public static int reverse(int num){
	   int rev=0;
	   for(int i=num;i!=0;i/=10){
	      rev=rev*10+(i%10);
	   }
	   return rev;
	}
}*/

//range of MysteryNumber

class MysteryNumber{
      public static void main(String[] args){
		  int start=1;
		  int end=200;
		  while(start<=end){
		     if(isMystery(start)){
			     System.out.println(start);
		    }
			start++;
		  }
	  }
	  public static boolean isMystery(int num){
		  int n=11;
		  
		  while(true){
			  int rev=reverse(n);
			  if(n+rev==num){
				  return true;
			  }
			  else if(n+rev<num){
				  n++;
			  }
			  else{
				  break;
			  }
			  
		  }
		  return false;
	  }
	  public static int reverse(int n){
		  int rev=0;
		  for(int i=n;i!=0;i/=10){
			  rev=rev*10+(i%10);
		  }
		  return rev;
	  }
}