//range of perfect number
import java.util.Scanner;
class RangeOfPerfectNumber{
    public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter starting number:");
	   int start=sc.nextInt();
	   System.out.println("Enter ending number");
	   int end=sc.nextInt();
	   
	   for(;start<=end;start++){
	     int sum=0;
		 int div;
		 for(div=1;div<start;div++){
		    if(start%div==0){
			   sum+=div;
			}
		 }
		 if(sum==start){
		   System.out.println(start);
		 }
	   }
	}
}