
class PascalTriangle1{
    public static void main(String[] args){
	   pascal(7);
	}
	public static int formula(int n,int r){
	    return factorial(n)/factorial(n-r)*factorial(r);
	}
	public static factorial(int num){
	   int fact=1;
	   for(int i=1;i<=num;i++){
	       fact*=i;
	   }
	   return fact;
	}
	public static void pascal(int num){
	    for(int i=1;i<num;i++){
		   for(int j=1;j<num-i;j++){
		      System.out.print(" "+" ");
		   }
		   for(int j=1;j<=i;j++){
		      System.out.print(formula(i,j)+" ");
		   }
		}
		System.out.println();
	}
}