// sum of digit is prime or not

import java.util.Scanner;
class DigitSumPrime{
     public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int num=sc.nextInt();
	   int sum=0;
	   for(int i=num;i!=0;i/=10){
		   sum+=(i%10);
	   }
	   System.out.println(sum);
	    int i;
	    for(i=2;i<=sum;i++){
			if(sum%i==0){
				break;
			}
		}
		if(sum==i){
			System.out.println("It is prime number");
		}
		else{
			System.out.println("It is prime not number");
		}
        	   
	 
	 }
}