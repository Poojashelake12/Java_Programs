//print even digit from give number

class EvenDigits{
    public static void main(String[] args){
	   int num=123456;
	   
	   while(num>0){
	      int digit=num%10;
		  if(digit%2==0){
		    System.out.println(digit);
		  }
		  num/=10;
	   }
	}
}