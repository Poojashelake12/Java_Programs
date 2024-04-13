

class Logical_Operator{
     public static void main(String args[]){
	      System.out.println(true && false);  //false
		   System.out.println(true || false);  //true 
		   System.out.println(!false);//true 
		   System.out.println(true==true && (!false)); //true
		   System.out.println(10>'w' || '1'>1); //true
		   //System.out.println(true>(0-0)  && 4>5); //CTE
      	    System.out.println("Q_Spider" == "q_Spider" && true); //false
			System.out.println(true && 34>=34.0);//false
			System.out.println(!(22/7 > (22.0/7.0)));//true
	 }
}