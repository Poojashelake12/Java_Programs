import java.util.*;

class IntData{
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		int num1=sc.nextInt();
		
		System.out.println("Enter the Second Number");
		int num2=sc.nextInt();
		
		int ans=num1+num2;
		System.out.println("Sum of "+num1+" and "+num2+" is: "+ans);
   }
}