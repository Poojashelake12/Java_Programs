import java.util.Scanner;

class ImpPattern{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int n=sc.nextInt();
	  
	  for(int i=1;i<=n;i++){
		  int ans=i;
	     for(int j=1;j<=n;j++){
		    System.out.print(ans+" ");
			ans+=n;
		 }
           System.out.println();
	  }
   }
}