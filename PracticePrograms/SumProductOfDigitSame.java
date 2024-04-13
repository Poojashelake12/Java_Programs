//check sum of digit and product of digit is same or not

import java.util.Scanner;
class SumProductOfDigitSame{
	public static void main(String[] args)
	{
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int sum=0,product=1;
	while(num>0){
	   int digit=num%10;
	   sum+=digit;
	   product*=digit;
	   num/=10;
	}
	System.out.println(sum+" "+product);
	if(sum==product){
	   System.out.println("Sum of digit and product of digit are same");
	}
	else{
	  System.out.println("Sum of digit and product of digit are not same");
	}
	}
}