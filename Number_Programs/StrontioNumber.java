
class StrontioNumber{
    public static void main(String[] args){
	   int num=1376;
	   if(isStrontio(num)){
	      System.out.println("It is Strontio Number");
	   }
	   else{
	      System.out.println("It is not Strontio Number");
	   }
	}
	public static boolean isStrontio(int num){
	    int ct=count(num) ;
		int dnum=0;
		int tenthplace=0,handredplace=0;
		if(ct==4){
		     dnum=num*2;
			 dnum/=10;
			 tenthplace=dnum%10;
			 dnum/=10;
			 handredplace=dnum%10;
		}
		
		return tenthplace==handredplace;	
			
	}

	public static int count(int num){
	    int ct=0;
		for(int i=num;i!=0;i/=10){
		    ct++;
		}
		return ct;
	}
}