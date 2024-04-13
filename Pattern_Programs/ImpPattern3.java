import java.util.Scanner;
/*
class ImpPattern3{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int n=sc.nextInt();
	 
	 int val;
	 for(int i=1;i<=n;i++){
		 val=n-1;
		 int ans=i;
		 //System.out.print(i+" ");
	    for(int j=1;j<=i;j++){
		    
		   System.out.print(ans+" ");
		   ans+=val;
		   val--;
		}
		System.out.println();
	 }
   }
}*/


class ImpPattern3{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int n=sc.nextInt();
	 
	 int val=0;
	 for(int i=1;i<=n;i++){
		 val=i;
		 //System.out.print(val+" ");
	    for(int j=1;j<=i;j++){
		    
		   System.out.print(val+" ");
		   val=val+n-j;
		}
		System.out.println();
	 }
   }
}