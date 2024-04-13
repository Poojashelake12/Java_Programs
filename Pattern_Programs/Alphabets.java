import java.util.Scanner;

class Alphabets{
     public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the string");
		 //String str=sc.next();
		 char ch='A';
		 
		 switch(ch){
		    case 'A':{
			        for(int i=1;i<=5;i++){
					   for(int j=1;j<=4;j++){
					     if(i==1&&j==2 || i==1&&j==3 || i==2&&j==1 || i==2&&j==4 || i==3&&j<=4 ||i==4&&j==1 ||i==4&&j==4 || i==5&&j==1 ||i==5&&j==4){
						    System.out.print("*"+" ");
						 }
						 else{
						   System.out.print(" "+" ");
						 }
					   }
					   System.out.println();
					}
			}
			 case 'B':{
				     
				 
			    }
		 }
		 
	 }
}