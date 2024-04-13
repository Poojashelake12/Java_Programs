import java.util.*;

class LongData{
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		long num1=sc.nextLong();
		
		System.out.println("Enter the Second Number");
		long num2=sc.nextLong();
		
		long ans=num1+num2;
		System.out.println("Sum of "+num1+" and "+num2+" is: "+ans);
   }
}