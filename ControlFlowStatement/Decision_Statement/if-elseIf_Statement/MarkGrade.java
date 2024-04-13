import java.util.Scanner;

class MarkGrade{
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the marks");
		int mark=sc.nextInt();
		
		if(mark>=60){
		    System.out.println("Grade: First Division");
		}
		else if(mark>=45){
		  System.out.println("Grade: Second Division");
		}
		else if(mark>=33){
		   System.out.println("Grade: Third Division");
		}
		else{
		    System.out.println("Fail!");
		}
	}
}