import java.util.Scanner;

class leftAlphabetRectangle{
    public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int n=sc.nextInt();
	  
	  for(int i=0;i<n;i++){
	     for(int j=0;j<=i;j++){
		    System.out.print((char)(i+65)+" ");
		 }
		 System.out.println();
	  }
	}
}