
import java.util.Scanner;
class ByteData{
    public static void main(String[] args){
	     
		 Scanner sc=new Scanner(System.in);
		 
	     System.out.println("Enter the first number");
		 int num1=sc.nextByte();
		 
		 System.out.println("Enter the second number");
		 int num2=sc.nextByte();
		 
		 int ans=num1+num2;
		 
		 System.out.println("sum of "+num1+" and "+num2+" is: "+ans);
		   
	}
}