import java.util.Scanner;

class TakeTrainingORNot{
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Training is taking or not");
		
		String str=sc.next();
		
		if(str.equals("no")){
		   System.out.println("please take training first");
		}
		  System.out.println("Allow for interview");
	}
}