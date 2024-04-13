import java.util.Scanner;

class LateInClass{
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Are you late in class or not");
		
		String str=sc.next();
		//System.out.println(str);
		if(str.equals("yes")){
		     System.out.println("Wait for some time");
		}
		//System.out.println(str.equals("yes"));
		System.out.println("Attend the class");
	}
}