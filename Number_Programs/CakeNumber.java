class CakeNumber{
     public static void main(String[] args){
	     int num=4;
		  int res=cakeNumber(num);
		  System.out.println(res);
	 }
	 public static int cakeNumber(int num){
	    return ((num*num*num)+5*num+6)/6;
	 }
}