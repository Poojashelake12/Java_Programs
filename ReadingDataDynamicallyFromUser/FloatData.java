import java.util.Scanner;

class FloatData{
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		 float num1=sc.nextFloat();
		
		System.out.println("Enter the Second Number");
		 float num2=sc.nextFloat();
		
		float ans=num1+num2;
		System.out.println("Sum of "+num1+" and "+num2+" is: "+ans);
   }
}