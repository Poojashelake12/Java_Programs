import java.util.Scanner;

class downFullTriangle{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int n=sc.nextInt();
	   
	   for(int i=0;i<n;i++){
	      for(int j=0;j<n-1;j++){
		    if(j<i){
			   System.out.print("  ");
			}
			else{
			  System.out.print("*"+" ");
			}
		  }
		  for(int j=0;j<n-i;j++){
			  System.out.print("*"+" ");
		  }
		  System.out.println();
	   }
   }
}