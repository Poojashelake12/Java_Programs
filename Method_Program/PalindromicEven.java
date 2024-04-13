import java.util.Scanner;
/*
class PalindromicEven{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number");
		int num=sc.nextInt();
		int rev=reverse(num);
		if(isPalindrome(num,rev)){
		    if(isEven(num)){
			   System.out.println("It is palindromic even number");
			}
			else{
			   System.out.println("It is not palindromic even number");
			}
		}
		else{
		   System.out.println("It is not palindrome number");
		}
		
	}
	
	public static int reverse(int num){
	   int rev=0;
	   for(int i=num;i!=0;i/=10){
	       rev=rev*10+(i%10);
		   
	   }
	   return rev;
	}
	public static boolean isPalindrome(int num,int rev){
	    if(num==rev)
             return  true;
        else
             return false;			 
	}
	
	public static boolean isEven(int num){
		if(num%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	
}*/

class PalindromicEven{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number");
		int num=sc.nextInt();
		int rev=reverse(num);
		if(isPalindrome(num,rev) && isEven(num)){
			System.out.println("It is palindromic even number");
		}
		else{
			System.out.println("It is not palindromic even number");
		}
		
	}
	
	public static int reverse(int num){
		int rev=0;
		for(int i=num;i!=0;i/=10){
			rev=rev*10+(i%10);
		}
		return rev;
	}
	public static boolean isEven(int num){
		return num%2==0;
	}
	public static boolean isPalindrome(int num,int rev){
		return num==rev;
	}
		
}