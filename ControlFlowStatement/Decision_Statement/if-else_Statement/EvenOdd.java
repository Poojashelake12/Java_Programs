import java.util.Scanner;

class EvenOdd{
    public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter the number");
	   int num=sc.nextInt();
	   
	   if(num%2==0){
	     System.out.println("Number is an even");
	   }
	   else{
	      System.out.println("Number is odd");
	   }
	}
}