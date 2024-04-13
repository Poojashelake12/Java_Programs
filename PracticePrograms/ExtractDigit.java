//extract digit from given number

class ExtractDigit{
    public static void main(String[] args){
	    int num=1234;
		
		while(num>0){
		   int digit=num%10;
		   System.out.println(digit);
		   num/=10;
		}
	}
}