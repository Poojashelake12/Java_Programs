//check nth febonacii number is prime or not

import java.util.Scanner;
class NthfebonaciiPrime{
    public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num =sc.nextInt();
	  int n1=0,n2=1,n3;
	  
	  for(int i=1;i<num;i++){
	     n3=n1+n2;
		 n1=n2;
		 n2=n3;
	  }
	  System.out.println("nth fibonacii number is:"+n1);
	  
	  int den;
	  for(den=2;den<n1;den++){
	     if(n1%den==0){
		    break;
		 }
	  }
	  //System.out.println(den+" "+num );
	  if(den==n1){
	    System.out.println("It is prime number");
	  }
	  else{
	    System.out.println("It is not prime number");
	  }
	}
}