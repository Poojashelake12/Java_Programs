

import java.util.Scanner;
class FibonaciiNumberUsingDOWhile{
    public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int num=sc.nextInt();
	   int n1=0,n2=1,n3;
	   
	   do{
	       if(num==n1){
		     System.out.println("It is fiboncii number");
			 break;
		   }
		   else if(n1>num){
		     System.out.println("It is not febonacii number");
			 break;
		   }
		   else{
		       n3=n1+n2;
			   n1=n2;
			   n2=n3;
		   }
	   }while(true);
	}
}