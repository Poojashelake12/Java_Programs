//sum of natural number

import java.util.Scanner;
class SumOfNatural{
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++){
		   sum+=i;
		}
		System.out.println(sum);
   }
}
