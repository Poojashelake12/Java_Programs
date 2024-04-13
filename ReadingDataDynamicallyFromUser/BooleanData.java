import java.util.Scanner;

class BooleanData{
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the charecter Number");
		boolean a=sc.nextBoolean();
		
		//System.out.println("Enter the charecter Number");
		//char b=sc.nextBoolean();
		
		//char ans=a+b;
		System.out.println("negation of a:"+!a);
   }
}