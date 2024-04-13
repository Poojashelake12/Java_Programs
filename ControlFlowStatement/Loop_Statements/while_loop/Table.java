
//print the table
import java.util.Scanner;

class Table{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
	  int num=1;
	  System.out.println("Enter the number");
	  int table=sc.nextInt();
	  while(num<=10){
	      System.out.println(table+" * "+num+" = "+table*num);
		  num++;
	  }
   }
}