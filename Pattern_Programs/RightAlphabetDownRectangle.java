import java.util.Scanner;

class RightAlphabetDownRectangle{
    public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int n=sc.nextInt();
	  
	  for(int i=0;i<n;i++){
	     for(int j=0;j<n;j++){
		   if(j<i){
		      System.out.print("  ");
		   }
		   else{
		     System.out.print((char)(i+65)+" ");
		   }
		 }
		 System.out.println();
	  }
	}
}