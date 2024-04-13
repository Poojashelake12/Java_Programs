/*
class DecimalToHexaDecimal{
     public static void main(String[] args){
	    int num=15;
		System.out.println(decToHex(num));
	 }
	 public static String decToHex(int num){
	     String ans="";
		 
		 int rem=num%16;
		 if(rem>=0 && rem<=9){
		     ans=rem+ans;
		 }
		 else if(rem>9 && rem<=15){
		     ans=((char)(rem+55))+ans;
		 }
		 return ans;
	 }
	 
}*/


class DecimalToHexaDecimal{
	  public static void main(String[] args){
	    int num=15;
		System.out.println(decToHex(num));
	  }
	  public static String decToHex(int num){
		  String ans=" ";
		  int rem=num%16;
		  if(rem>=0 && rem<=9){
			  ans=rem+ans;
		  }
		  else if(rem>9 && rem<=15){
			  switch(rem){
				  case 10:
				  {
					  ans='A'+ans;
					  break;
				  }
				  case 11:{
					  ans='B'+ans;
					  break;
				  }
				  case 12:{
					  ans='C'+ans;
					  break;
				  }
				  case 13:{
					  ans='D'+ans;
					  break;
				  }
				  case 14:{
					  ans='E'+ans;
					  break;
				  }
				  case 15:{
					  ans='F'+ans;
				  }
			  }
		  }
		  return ans;
	  }
}