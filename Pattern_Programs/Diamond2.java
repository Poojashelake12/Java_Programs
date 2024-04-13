import java.util.Scanner;

class Diamond2{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int n=sc.nextInt();
	  
	   int space=n/2,star=1;
	  for(int i=0;i<=n;i++){
	     for(int j=0;j<space;j++){
		     System.out.print("  ");
		 }
		 for(int j=0;j<star;j++){
		    System.out.print("*"+" ");
		 }
		 if(i<n/2){
		   space--;
		   star+=2;
		 }
		 else{
		   space++;
		   star-=2;
		 }
		 System.out.println();
	  }
   }
}