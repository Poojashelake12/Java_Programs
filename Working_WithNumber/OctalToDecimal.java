//convert octal to decimal
import java.util.Scanner;
class OctalToDecimal{
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter octal number");
		int octal=sc.nextInt();
		
		int decimal=0,n=0;
		
		while(octal!=0){
		   int digit=octal%10;
		   decimal+=digit*(Math.pow(8,n));
		   octal/=10;
		   n++;
		}
		System.out.println("decimal number is:"+decimal);
	}
}