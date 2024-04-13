class HexadecimalToDecimal{
   public static void main(String[] args){
      String str="121";
	  str=str.toUpperCase();
	  int val=0;
	 String digits = "0123456789ABCDEF";
	  for(int i=0;i<str.length();i++){
	    char ch=str.charAt(i);
		int d=digits.indexOf(ch);
		val=16*val+d;
	  }
	  System.out.println(val);
   }
}