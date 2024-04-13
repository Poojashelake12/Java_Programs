import java.util.Scanner;

class AgeGreateThanFive{
     public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
		System.out.println("your age is greate than five or not");
		
		boolean input=sc.nextBoolean();
		
		if(input){
		    System.out.println("please pay:"+150+" Rs/-");
		}
		System.out.println("allow in park");
	 }
}