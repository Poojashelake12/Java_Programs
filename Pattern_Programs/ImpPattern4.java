import java.util.Scanner;
/*
class ImpPattern4{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int n=sc.nextInt();
	 
	 int odd=7,even=-2;
	 for(int i=1;i<=n;i++){
	     int ans=i;
          System.out.print(ans+" ");
	    for(int j=1;j<i;j++){
		     if(j%2==0){
				 
			    ans+=even;
				System.out.print(ans+" ");
			 }
			 else{
			    ans+=odd;
				System.out.print(ans+" ");
			 }
		    
		}
		even+=2;
		odd-=2;
		System.out.println();
	 }
   }
}*/


class ImpPattern4{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int n=sc.nextInt();
	 
	 int odd=5,even=0;
	 for(int i=1;i<=n;i++){
	     int ans=i;
          System.out.print(ans+" ");
	    for(int j=1;j<i;j++){
		     if(j%2==0){
				 
			    ans+=even;
				System.out.print(ans+" ");
			 }
			 else{
			    ans+=odd;
				System.out.print(ans+" ");
			 }
		    
		}
		if(i>1){
			even+=2;
		   odd-=2;
		}
		
		System.out.println();
	 }
   }
}