
class DecimalToOctal{
    public static void main(String[] args){
	    int num=11;
		System.out.println(DecToOct(num));
	}
	public static int DecToOct(int num){
	      int ans=0;
		  
		  for(int i=0;num!=0;i++,num/=8){
		      int rem=num%8;
			  ans=rem+power(8,i)+ans;
		  }
		  return ans;
	}
	public static int power(int base,int raise){
	    int pow=1;
		
		for(int i=1;i<=raise;i++){
		    pow=pow*base;
		}
		return pow;
		
	}
}