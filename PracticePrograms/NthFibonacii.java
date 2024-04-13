//find nth fiebonacii number

import java.util.Scanner;
class NthFibonacii{
    public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int num=sc.nextInt();
	   
	   int n1=0,n2=1,n3=0;
	   
	   for(int i=1;i<num;i++){
	      n3=n1+n2;
		  n1=n2;
		  n2=n3;
	   }
	   System.out.println("nth fibonacii number is:"+n1);
	}
}