import java.util.Scanner;

class SumDigitSquare1{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num=sc.nextInt();
	  int sum=0;
	    while(num!=0){
		    int digit=extract(num);
			 sum+=square(digit);
			 num/=10;
		}
	  System.out.println(sum);
   }
    public static int extract(int num){
	    int rem=num%10;
		return rem;
	}
	public static int square(int num){
        return num*num;
    }	
}