//Armstrong number

import java.util.Scanner;
class ArmstrongNumber{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
	 int num=sc.nextInt();
	 int temp=num, len=0;
	 
	 while(temp>0){
		len++;
		temp/=10;
	 }
      System.out.println(len);
	 int sum=0;
      int temp2=num;
	 while(num>0){
	   int digit=num%10;
	    int pow=(int)(Math.pow(digit,len));
         System.out.println(pow);
         sum+=pow;
        num/=10;
	 }
      System.out.println(sum);
	  if(temp2==sum){
           System.out.println("it is Armstrong number");
       }
       else{
           System.out.println("it is not Armstrong number");
        }
	 
   }
}