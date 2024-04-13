import java.util.Scanner;

class StrongNumberWhile{
    public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int num=sc.nextInt();
        int sum=0;
		int temp=num;
	   while(num!=0){
	      int digit=num%10;
		 
		  int fact=1;
		  int i=1;
		  while(i<=digit){
			   fact=fact*i;
			   i++;
		  }
		  /*for(int i=1;i<=digit;i++){
		      fact*=i;
			  //System.out.println(fact);
		  }*/
		  
		 
		  sum=sum+fact;
		   //System.out.println(sum);
		 
		  num/=10;
	   }
	   System.out.println(sum);
	   System.out.println(num);
	   if(temp==sum){
	      System.out.println("It is strong number");
	   }
	   else{
	     System.out.println("It is not strong number");
	   }
	}
}