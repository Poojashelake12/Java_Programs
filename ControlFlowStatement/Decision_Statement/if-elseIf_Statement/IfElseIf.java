import java.util.Scanner;

class IfElseIf{
    public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the character");
	   char ch=sc.next().charAt(0);
	   
	   if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
	       if(ch>='a' && ch<='z'){
		     System.out.println("character in lowercase");
		   }
		   else{
		      System.out.println("character in uppercase");
		   }
	   }
	   else if(ch>='0' && ch<='9'){
	     System.out.println("it is a digit");
	   }
	   else{
	      System.out.println("It is a special character");
	   }
	   
	}
}