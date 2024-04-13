//check given numbers are co-prime or not

import java.util.Scanner;

class CoprimeNumber{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter first number");
	 int n1=sc.nextInt();
	 System.out.println("Enter second number");
	 int n2=sc.nextInt();
	 
	 int small= n1<n2 ? n1 : n2;
	 int hcf=0;
	 System.out.println(small);
	 while(true){
	    if(n1%small==0 && n2%small==0){
		   hcf=small;
		  // System.out.println(hcf);
		   break;
		}
		small--;
	 }
	 if(hcf==1){
	    System.out.println("It is co-prime numbers");
	 }
	 else{
	    System.out.println("It is not co-prime numbers");
	 }
   }
}