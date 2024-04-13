//power of number

import java.util.Scanner;
class PowerOfNumber{
     public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base");
		int base=sc.nextInt();
		System.out.println("Enter the raise number");
		int raise=sc.nextInt();
		int power=1;
		for(int i=1;i<=raise;i++){
		  power*=base;
		}
		
		System.out.println(power);
		//System.out.println(base+" "+(raise-1));
		System.out.println(Math.pow(base,raise));
	 }
}