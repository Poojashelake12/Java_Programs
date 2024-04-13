import java.util.Scanner;

class Introduction{
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		
		System.out.println("Enter the city name");
		String city=sc.next();
		
		System.out.println("Enter mobile number");
		long mobile=sc.nextLong();
		
		System.out.println("Enter the college name");
		String collegeName=sc.next();
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("City: "+city);
		System.out.println("mobile: "+mobile);
		System.out.println("college name:"+collegeName);
		
		
		
		
		
		
	}
}