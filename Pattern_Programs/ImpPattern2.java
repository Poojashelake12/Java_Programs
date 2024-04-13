import java.util.Scanner;

class ImpPattern2{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int n=sc.nextInt();
	  int odd=7,even=1;
	  for(int i=1;i<=n;i++){
	     System.out.print(i+" ");
		 int ans=i;
	     for(int j=1;j<n;j++){
		    if(j%2!=0){
			   ans=ans+odd;
			   System.out.print(ans+" ");
			}
			else{
			   ans+=even;
			   System.out.print(ans+" ");
			}
			
		 }
		 System.out.println();
		 even+=2;
		 odd-=2;
	  }
   }
}