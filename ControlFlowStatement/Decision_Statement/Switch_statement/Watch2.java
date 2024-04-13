import java.util.Scanner;

class Watch2{
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the:1)am , 2)pm");
		String s=sc.next();
		
		switch(s){
		   case "am":
		          System.out.println("Enter the timing between 1 to 12");
				  int timing=sc.nextInt();
				  if(timing>=5 && timing <12){
				     System.out.println("Good morning ");
				  }
				  else if(timing<=12 && timing>=6){
				     System.out.println("Good night");
				  }
				   break;
		    case "pm":
				   System.out.println("Enter the timing between 1 to 12");
				   int timing1=sc.nextInt();
				  if(timing1<=12 && timing1 <=6){
				     System.out.println("Good Afternoon");
				  }
				  else if(timing1<12 && timing1>=6){
				     System.out.println("Good night");
				  }
				  break;
		     default:
			    System.out.println("Enter correct timing");
		}
	}
}