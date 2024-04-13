//print the table;

import java.util.Scanner;

class Table{
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number which you want table");
		int t=sc.nextInt();
		
		for(int num=1;num<=10;num++){
		   System.out.println(num+" * "+t+" = "+(num*t));
		}
	}
}