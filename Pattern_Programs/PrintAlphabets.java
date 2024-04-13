import java.util.Scanner;

class PrintAlphabets{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int n=sc.nextInt();
	    char a='a';
	  for(int i=1;i<=n;i++){
		  
	     for(int j=1;j<=n;j++){
			 
		    System.out.print(a+" ");
			a++;
		 }
	     System.out.println();
		 
	  }
   }
}