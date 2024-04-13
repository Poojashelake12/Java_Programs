import java.util.Scanner;

class Diamond{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int n=sc.nextInt();
	 
	 for(int i=0;i<n-1;i++){
	    for(int j=0;j<n-1;j++){
		   if(j<n-i-1){
		      System.out.print("  ");
		   }
		   else{
		      System.out.print("*"+" ");
		   }
		}
		for(int j=0;j<=i;j++){
			System.out.print("*"+" ");
		}
		System.out.println();
	 }
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