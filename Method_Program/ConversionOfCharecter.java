class ConversionOfCharecter{
   public static void main(String[] args){
        upperToLower('A');
		lowerToUpper('a');
   }
   
   public static void upperToLower(char ch){
	 
       System.out.println((char)(ch+32));
   }
   
   public static void lowerToUpper(char ch){
       System.out.println((char)(ch-32));
   }
}