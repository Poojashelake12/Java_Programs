import java.util.Scanner;

class CharData{
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the charecter Number");
		char a=sc.next().charAt(0);
		
		System.out.println("Enter the charecter Number");
		char b=sc.next().charAt(0);
		
		//char ans=a+b;
		System.out.println("the value of a and b is : " + a +" and "+b);
   }
}