//nth febonacii number method2

import java.util.Scanner;
class NthFibonacii2{
    public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int num=sc.nextInt();
	   
	   int n1=0,n2=1,n3;
	   for(int i=1;i<=num;i++){
	     if(n1==num){
		    n3=n1+n2;
			System.out.println("nth number is"+n1);
			n1=n2;
			n2=n1;
		 }
	   }
	}
}