//print even number from given range

import java.util.Scanner;
class EvenNumber{
       public static void main(String[] args){
	       Scanner sc=new Scanner(System.in);
		   
		   System.out.println("Enter the starting number");
		   int start=sc.nextInt();
		   System.out.println("Enter the ending number");
		   int end=sc.nextInt();
		   
		   for(int num=start;num<=end;num++){
		      if(num%2==0){
			     System.out.println(num);
			  }
		   }
	   }
}