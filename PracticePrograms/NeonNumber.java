//check given number is neon number or not

import java.util.Scanner;
class NeonNumber{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int num=sc.nextInt();
	 
	 int square=num*num;
	 int sum=0;
	 for(int i=square;i!=0;i/=10){
	   sum+=i%10;
	 }
	 if(sum==num){
	   System.out.println("It is Neon number");
	 }
	 else{
	   System.out.println("It is not Neon number");
	 }
   }
}