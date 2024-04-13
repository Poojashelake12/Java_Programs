import java.util.Scanner;
class HalfHallowTriangle{
    public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int n=sc.nextInt();
	   
	   for(int i=0;i<=n/2;i++){
	     for(int j=0;j<n;j++){
			
		    if(i==0 ||i+j==n-1 || i==j)
			{
			  System.out.print("*"+" ");
			}
			else{
			  System.out.print("  ");
			}
		 }
		 System.out.println();
	   } 
	}
}