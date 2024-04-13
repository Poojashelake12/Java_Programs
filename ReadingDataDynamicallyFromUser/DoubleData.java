import java.util.Scanner;

class DoubleData{
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		 double num1=sc.nextDouble();
		
		System.out.println("Enter the Second Number");
		 double num2=sc.nextDouble();
		
		double ans=num1+num2;
		System.out.println("Sum of "+num1+" and "+num2+" is: "+ans);
   }
}