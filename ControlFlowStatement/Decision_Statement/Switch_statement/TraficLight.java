import java.util.Scanner;

class TraficLight{
     public static void main(String[] args){
	     Scanner sc=new Scanner(System.in);
		 System.out.println("1.Red \n 2.Green \n 3.Yello");
		 int choice=sc.nextInt();
		 
		 switch(choice){
		    case 1:
			        System.out.println("Stop");
					break;
			case 2:
			       System.out.println("Go");
				   break;
			case 3:
			       System.out.println("get ready");
				   break;
			default:
			      System.out.println("Enter valid choice");
		 }
	 }
}