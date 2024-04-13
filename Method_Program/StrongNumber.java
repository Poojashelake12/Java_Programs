import java.util.Scanner;
//Strong number

class StrongNumber{
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		while(num!=0){
		   int digit=extract(num);
		   sum+=factorial(digit);
		   num/=10;
		}
		System.out.println(sum+" "+temp);
		if(strongNumber(temp,sum)){
		   System.out.println("It is strong number");
		}
		else{
		   System.out.println("It is not strong number");
		}
   }
   public static int extract(int num){
	   return num%10;
   }
   public static int factorial(int num){
       int fact=1;
	   for(int i=1;i<=num;i++){
	      fact=fact*i;
	   }
	   return fact;
   }
   public static boolean strongNumber(int num,int sum){
        return num==sum;
   }
}