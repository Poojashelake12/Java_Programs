//check given number is prime or not
import java.util.Scanner;
class PrimeNumber{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num=sc.nextInt();
	  
	  /*int den=2;
	  while(den<num){
	     if(num%den==0){
		    break;
		 }
		 den++;
	  }
	  if(num==den){
	     System.out.println("It is prime number");
	  }
	  else{
	    System.out.println("It is not prime number");
	  }*/
	  //--------------------------------------------------
	 /* int den;
	  for(den=2;den<num;den++){
		  if(num%den==0){
			  break;
		  }
	  }
	  if(num==den){
		  System.out.println("It is prime number");
	  }
	  else{
		  System.out.println("It is not prime number");
	  }*/
	  
	  //----------------------------------------------------
	  
	  int den;
	  for(den=2;den<num/2;den++){
		  if((num)%den==0){
			  break;
		  }
	  }
	  if(num==2 || num==3){
		  System.out.println("It is prime number");
		   return;
	  }
	  System.out.println(den);
	  System.out.println(num/2);
	  if((num/2)==den){
		  System.out.println("It is prime number");
	  }
	  else{
		  System.out.println("It is not prime number");
	  }
   }
}