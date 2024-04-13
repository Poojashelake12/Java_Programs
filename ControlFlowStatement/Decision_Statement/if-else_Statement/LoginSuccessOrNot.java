import java.util.Scanner;

class LoginSuccessOrNot{
     public static void main(String args[]){
	     Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter your pin");
		 int pin=sc.nextInt();
		 
		 if(pin==1234){
		   System.out.println("Login Success");
		 }
		 else{
		    System.out.println("Login Failed!");
		 }
	 }
}