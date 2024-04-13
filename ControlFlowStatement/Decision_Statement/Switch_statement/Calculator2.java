import java.util.Scanner;

class Calculator2{
     public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("------------------Welcome to Calculator-------------------");
		System.out.println(" 1. Addition(+) \n 2.substraction(-) \n 3.Multiplication(*) \n 4. Division(/) ");
		//char operator=sc.next().charAt(0);
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		
		switch(ch){
		   case 1:
		         System.out.println("Enter first number");
				 int num1=sc.nextInt();
				 System.out.println("Enter second number");
				 int num2=sc.nextInt();
				 double ans=(num1+num2);
				 System.out.println("How do you want your answer");
				 System.out.println("1.Whole number");
				 System.out.println("1.decimal number number");
				 switch(sc.nextInt()){
					case 1:{
				         System.out.println(addition of"+num1+"and "+ num2 +"is:"+((int)ans);
				         break;
					}
					case 2{
						System.out.println(addition of"+num1+"and "+ num2 +"is:"+(ans);
				         break;
					}
				 }
		   case 2:
		         System.out.println("Enter first number");
				  num1=sc.nextInt();
				 System.out.println("Enter second number");
				  num2=sc.nextInt();
				 System.out.println("Substraction is: "+(num1-num2));
				 break;
		    case 3:
			     System.out.println("Enter first number");
				  num1=sc.nextInt();
				 System.out.println("Enter second number");
				  num2=sc.nextInt();
				 System.out.println("Multiplication is: "+(num1*num2));
				 break;
			case 4:
			     System.out.println("Enter first number");
				 double a=sc.nextDouble();
				 System.out.println("Enter second number");
				 double b=sc.nextDouble();
				 System.out.println("division of"+num1+"and "+ num2 +"is:"+(a/b));
				 break;
			default:
			     System.out.println("Enter correct choice");
		}
	 }
}