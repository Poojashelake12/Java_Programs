import java.util.Scanner;

class Calculator{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the first number:");
	  int num1=sc.nextInt();
	  System.out.println("Enter the second number:");
	  int num2=sc.nextInt();
	  System.out.println("Enter the operator:");
	  char ch=sc.next().charAt(0);
	  
	  switch(ch){
	    case '+':
		       System.out.println("num1+num2 = "+(num1+num2));
			   break;
		case '-':
		        System.out.println("num1-num2 = "+(num1-num2));
				break;
		case '*':
		        System.out.println("num1*num2 = "+(num1*num2));
				break;
		case '/':
		        System.out.println("num1/num2 = "+(num1/num2));
				break; 
		case '%':
		        System.out.println("num1%num2 = "+(num1%num2));
				break;
		default:
		       System.out.println("Enter correct operator");
	  }
	  
	  
   }
}