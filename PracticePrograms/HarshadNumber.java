//check given number is harshad number or not

import java.util.Scanner;
class HarshadNumber{
    public static void main(String[] args){
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num=sc.nextInt();
	  int sum=0;
	  for(int i=num;i!=0;i/=10){
	     sum+=i%10;
	  }
	  if(num%sum==0){
	    System.out.println("It is harshad number");
	  }
	  else{
	    System.out.println("It is not harshad number");
	  }
	  
	}
}