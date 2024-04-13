//check if the given number all digit febonacii or not

import java.util.Scanner;
class DigitFibonacii{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int num=sc.nextInt();
	 
	 while(num!=0){
	    int digit=num%10;
		//int n1=0,n2=1,n3;
		
		if(digit!=0 && digit!=1 && digit!=2 && digit!=3 && digit!=5 && digit!=8){
		   break;
		}
		num/=10;
	 }
	 if(num==0){
	    System.out.println("It is febonacii number");
	 }
	 else{
		 System.out.println("It is not a febonacii number");
	 }
   }
}