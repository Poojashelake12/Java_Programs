//find the largest number from four number

class LargestNumFromFourNum{
       public static void main(String[] args){
	       int n1=2, n2=5 , n3=1, n4=10;
		   
		   //-------------------------( 1 )-------------------
		   
		   /*int large= (n1>n2) ? (n1>n3 ? n1 : n3) : (n2>n3 ? n2 : n3);
		   int largest= (n4>large) ? n4 :large;
		   System.out.println(largest);*/
		   
		   //********************************************************************
		   
		   //---------------------------( 2 )---------------
		   
		       int res;
		    int ans= n4>(res=(n1>n2) ? (n1>n3 ? n1 : n3) : (n2>n3 ? n2 : n3)) ? n4 : res;
			System.out.println(ans);
		   
	   }
}