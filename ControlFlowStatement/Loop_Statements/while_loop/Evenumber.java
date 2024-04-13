//print even number from give range
import java.util.Scanner;
class Evenumber{
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting number");
		int start=sc.nextInt();
		System.out.println("Enter ending number");
		int end=sc.nextInt();
		
		while(start<=end){
	    if(start%2==0){
		      System.out.println(start);
		   }
		   start++;
		}
	}
}