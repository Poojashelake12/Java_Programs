//check given number is pronic  number or not

import java.util.Scanner;
/*class PronicNumber{
    public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int num=sc.nextInt();
	   boolean flag=false;
	   for(int i=1;i<=num;i++){
	        if(i*(i+1)==num){
			    flag=true;
				break;
			}
	   }
	   if(flag==true){
	     System.out.println("It is pronic number");
	   }
	   else{
	      System.out.println("It is not pronic number");
	   }
	
	}
}*/

class PronicNumber{
    public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int num=sc.nextInt();
	   int n=0;
	  // boolean flag=false;
	   for(int i=1;i<=num;i++){
	        if(i*(i+1)==num){
			    n=i*(i+1);
				break;
			}
			/*else if(n>num){
				break;
			}*/
	   }
	   System.out.println(n);
	   if(n==num){
	     System.out.println("It is pronic number");
	   }
	   else{
	      System.out.println("It is not pronic number");
	   }
	
	}
}