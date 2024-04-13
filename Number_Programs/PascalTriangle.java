
class PascalTriangle{
    public static void main(String[] args){
	    int row=6;
		int col=6;
		for(int i=1;i<=row;i++){
		   for(int j=1;j<=i;j++){
		        System.out.print(fact(i)/fact(i-j)*fact(j)+" ");
		   }
		   System.out.println();
		}
	}
     public static int fact(int num){
	     int fact=1;
		 for(int i=1;i<=num;i++){
		    fact=fact*i;
		 }
		 return fact;
	 }
}