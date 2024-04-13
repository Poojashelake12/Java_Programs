//find number is positive or negative

class PositiveNegative{
    public static void main(String[] args){
	      
		  int num=-12;
		  
		String ans=(num>=0) ? (num==0 ? " 0 is nither positive nor negative" : "number is positive") : "number is negative";
		
		System.out.println(ans);
	}
}