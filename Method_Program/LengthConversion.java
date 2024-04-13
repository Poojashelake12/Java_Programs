class LengthConversion{
    public static void main(String[] args){
	   meterToCM(1);
	}
	
	public static void meterToCM(double meter){
	    double cm=meter*100;
		System.out.println("Meter to CM:"+cm);
		cmToFoot(cm);
	}
	
	public static void cmToFoot(double cm){
	      double foot=cm*0.394;
		  System.out.println("CM to Foot:"+foot);
		  footToInch(foot);
	}
	
	public static void footToInch(double foot){
	     double inch=foot*0.000305;
		 System.out.println("Foot to inch:"+inch);
	}
}