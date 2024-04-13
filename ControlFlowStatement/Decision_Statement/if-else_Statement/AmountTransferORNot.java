import java.util.Scanner;

class AmountTransferORNot{
     public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter amount to transfer");
		
		double amount=sc.nextInt();
		double limit=20000.00;
		
		if(amount<=limit){
		     System.out.println("Amount transfer successfully!");
		}
		else{
		    System.out.println("Amount limit reached");
		}
	 }
}