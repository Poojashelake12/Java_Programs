//decimal to binary
//javac -processor com.example.MyAnnotationProcessor DecimalToBinary.java

import java.util.Scanner;
class DecimalBinary{
    public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   int[] binary=new int[100];
	   
	   System.out.println("Enter the decimal number");
	   int num=sc.nextInt();
	   
	   int i=0;
	   while(num!=0){
	      binary[i]=num%2;
		  num/=2;
		  i++;
	   }
	   System.out.println("Binary value is: ");
	   
	   for(int j=i-1;j>=0;j--){
	     System.out.print(binary[j]+"");
	   }
	}
}