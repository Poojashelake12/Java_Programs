class CurrencyConversion{
    public static void main(String[] args){
	  rupeesToDoller(1);
	  
	}
	
	public static void rupeesToDoller(double rupees){
	   double doller=rupees/82.92;
	   System.out.println(doller);
	   dollerToDihram(doller); 
	}
	public static void dollerToDihram(double doller){
	    double dhiram=doller*3.67;
		System.out.println(dhiram);
		dhiramToEuro(dhiram);
	}
	public static void dhiramToEuro(double dhiram){
	    double euro=dhiram/4;
		System.out.println(euro);
	}
}