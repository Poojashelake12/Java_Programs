/*
class AdamNumber{
    public static void main(String[] args){
	     int num=14;
		 if(isAdam(num)){
		    System.out.println("It is Adam Number");
		 }
		 else{
		    System.out.println("It is not Adam Number");
		 }
	}
	public static boolean isAdam(int num){
	      int rev=reverse(num);
		  return square(num)== reverse(square(rev));
	}
	public static int square(int num){
	    return num*num;
	}
	public static int reverse(int num){
	    int rev=0;
		for(int i=num;i!=0;i/=10){
		   rev=rev*10+(i%10);
		}
		return rev;
	}
}*/

//range of adam number

class AdamNumber{
    public static void main(String[] args){
		int start=1;
		int end=1000;
		while(start<=end){
			if(isAdam(start)){
				System.out.println(start);
			}
			start++;
		}
	}
	public static boolean isAdam(int num){
		 int rev=reverse(num);
		 return square(num)==reverse(square(rev));
		
	}
	public static int square(int num){
		return num*num;
	}
	public static int reverse(int num){
		int rev=0;
		for(int i=num;i!=0;i/=10){
			rev=rev*10+(i%10);
		}
		return rev;
	}
}