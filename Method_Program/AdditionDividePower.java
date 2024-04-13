class AdditionDividePower{
     public static void main(String[] args){
	     addition(4,5);
		 divide(10,2);
		 power(2,3);
	 }
	 
	 public static void addition(int a,int b){
	      int res=a+b;
		  System.out.println(res);
	 }
	 public static void divide(int a,int b){
	    int res=a/b;
		System.out.println(res);
	 }
	 public static void power(int base,int raise){
	     int pow=1;
	     for(int i=1;i<=raise;i++){
		     pow*=base;
			 
		 }
		 System.out.println(pow);
	 }
}