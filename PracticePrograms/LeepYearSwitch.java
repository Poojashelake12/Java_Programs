import java.util.Scanner;

class LeepYearSwitch{
    public static void main(String[] args){
	  Scanner sc=new Scanner(System.out.println);
	   
     System.out.println("1.marathi\n2.Hindi\n3.English");
     System.out.println("Enter your choice);
     int ch=sc.nextInt();
     
     switch(ch){
	   case 1:
	   {
	          System.out.println("Enter the year");
	          int year=sc.nextInt();
	   
	        if(year<1582){
                System.out.println("The year has to be greater than 1582");
	        }
	        else if(year%4==0&&year%100!=0 || year%400==0){
	            System.out.println("It is a leap year");
	        }
	        else{
	            System.out.println("It is not a leap year");
	        }
			break;
	   }
	    case 2:
	   {
	          System.out.println("Enter the year");
	          int year=sc.nextInt();
	   
	        if(year<1582){
                System.out.println("The year has to be greater than 1582");
	        }
	        else if(year%4==0&&year%100!=0 || year%400==0){
	            System.out.println("It is a leap year");
	        }
	        else{
	            System.out.println("It is not a leap year");
	        }
			break;
	   }
	   case 3:
	   {
	          System.out.println("Enter the year");
	          int year=sc.nextInt();
	   
	        if(year<1582){
                System.out.println("The year has to be greater than 1582");
	        }
	        else if(year%4==0&&year%100!=0 || year%400==0){
	            System.out.println("It is a leap year");
	        }
	        else{
	            System.out.println("It is not a leap year");
	        }
			break;
	   }
	   default:{
	        System.out.println(please enter correct choice);
	   }
	   
     }	   
	  
	}
}