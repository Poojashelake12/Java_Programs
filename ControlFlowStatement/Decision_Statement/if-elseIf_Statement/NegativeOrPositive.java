import java.util.Scanner;

class NegativeOrPositive{
    public static void main(String[] args){
	
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  
	  int num=sc.nextInt();
	  
	  if(num>0){
	      System.out.println("Number is positive number");
	  }
	  else if(num<0){
	      System.out.println("Number is negative number");
	  }
	  else{
	      System.out.println("Number is nither negative nor positive");
	  }
	}
}