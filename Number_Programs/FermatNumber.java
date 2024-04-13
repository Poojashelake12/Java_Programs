/*
class FermatNumber{
      public static void main(String[] args){
	      int num=4;
		  //System.out.println();
		  fermatNumber(num);
	  }
	  public static void fermatNumber(int num){
	       
		   for(int i=0;i<=num;i++){
		       System.out.println(power(2,power(2,i))+1);
		   }
	  }
	  public static int power(int base,int raise){
	      int pow=1;
		  for(int i=1;i<=raise;i++){
		      pow*=base;
		  }
		  return pow;
	  }
}*/


//Single number

class FermatNumber{
     public static void main(String[] args){
		 int num=2;
		 System.out.println(fermatNumber(num));
	 }
	 public static int fermatNumber(int num){
		 return power(2,power(2,num))+1;
	 }
	 public static int power(int num,int raise){
		 
		 int pow=1;
		 for(int i=1;i<=raise;i++){
			 pow*=num;
		 }
		 return pow;
	 }
}