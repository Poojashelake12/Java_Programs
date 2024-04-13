import java.util.Scanner;

class Watch{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
	 System.out.println("please enter number between 1 to 12");
	 int time =sc.nextInt();
	 
	 //System.out.println("Enter : "am" or "pm");
	 String s;//;=sc.next().charAt(0);
	 
	 switch(time){
	    case 1:
		       System.out.println("Enter:am or pm");
			   s=sc.next();
			   if(s.equals("am")){
			       System.out.println("midnight");
			   }
			   else{
			      System.out.println("Good Afternoon");
			   }
			   break;
		case 2:
		       System.out.println("Enter:am or pm");
			   s=sc.next();
			   if(s.equals("am")){
			       System.out.println("midnight");
			   }
			   else{
			      System.out.println("Good Afternoon");
			   }
			   break;
		case 3:
		       System.out.println("Enter:am or pm");
			   s=sc.next();
			   if(s.equals("am")){
			       System.out.println("midnight");
			   }
			   else{
			      System.out.println("Good Afternoon");
			   }
			   break;
		case 4:
		       System.out.println("Enter:am or pm");
			   s=sc.next();
			   if(s.equals("am")){
			       System.out.println("Good Morning");
			   }
			   else{
			      System.out.println("Good Afternoon");
			   }
			   break;
		case 5:
		      System.out.println("Enter:am or pm");
			   s=sc.next();
			   if(s.equals("am")){
			       System.out.println("Good Morning");
			   }
			   else{
			      System.out.println("Good Afternoon");
			   }
			   break;
		case 6:
		       System.out.println("Enter:am or pm");
			   s=sc.next();
			   if(s.equals("am")){
			       System.out.println("Good Morning");
			   }
			   else{
			      System.out.println("Good night");
			   }
			   break;
		case 7:
		      System.out.println("Enter:am or pm");
			   s=sc.next();
			   if(s.equals("am")){
			       System.out.println("Good morning");
			   }
			   else{
			      System.out.println("Good night");
			   }
			   break;
		case 8:
		       System.out.println("Enter:am or pm");
			   s=sc.next();
			   if(s.equals("am")){
			       System.out.println("Good morning");
			   }
			   else{
			      System.out.println("Good night");
			   }
			   break;
		 case 9:
		       System.out.println("Enter:am or pm");
			   s=sc.next();
			   if(s.equals("am")){
			       System.out.println("Good morning");
			   }
			   else{
			      System.out.println("Good night");
			   }
			   break;
		case 10:
		       System.out.println("Enter:am or pm");
			   s=sc.next();
			   if(s.equals("am")){
			       System.out.println("Good morning");
			   }
			   else{
			      System.out.println("Good night");
			   }
			   break;
	    case 11:
		        System.out.println("Enter:am or pm");
			   s=sc.next();
			   if(s.equals("am")){
			       System.out.println("Good morning");
			   }
			   else{
			      System.out.println("Good night");
			   }
			   break;
	     case 12:
		       System.out.println("Enter:am or pm" );
			   s=sc.next();
			   if(s.equals("am")){
			       System.out.println("Good morning");
			   }
			   else{
			      System.out.println("Good night");
			   }
			   break;
		default:
		      System.out.println("Enter correct timing");
			   
			   
	 }
   }
}
