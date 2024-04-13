//print the table 

import java.util.Scanner;

class Table{
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		
		int ip=sc.nextInt();
		int num=1;
		
		do
		{
		    System.out.println(ip+" * "+num+" = "+(ip*num));
			num++;
		}
		while(num<=10);
	}
}