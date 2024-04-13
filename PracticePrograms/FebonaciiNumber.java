//check the given number is febonacii or not

import java.util.Scanner;
class FebonaciiNumber{
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int n1=0,n2=1,n3;
		
		for(; ;){
		    if(n1==num){
			    System.out.println("It is febonacii number");
				break;
			}
			else if(n1>num){
			   System.out.println("It is not a febonacii number");
			   break;
			}
			else{
			    n3=n1+n2;
				n1=n2;
				n2=n3;
			}
		}
	}
}